package com.patikadev.View;

import com.patikadev.Help.Config;
import com.patikadev.Help.Helper;
import com.patikadev.Help.Item;
import com.patikadev.Model.Course;
import com.patikadev.Model.Operator;
import com.patikadev.Model.Patika;
import com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private final Operator operator;
    private  JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JButton btn_logout;
    private JPanel pnl__user_list;
    private JScrollPane scrl_user_list;
    private JTable tbl_user_list;
    private JPanel pnl_user_form;
    private JTextField fld_user_name;
    private JTextField fld_user_uname;
    private JTextField fld_user_pass;
    private JComboBox cmb_user_type;
    private JButton btn_user_add;
    private JTextField fld_user_id;
    private JButton btn_user_delete;
    private JTextField fld_search_user_name;
    private JTextField fld_search_user_username;
    private JComboBox cmb_search_user_type;
    private JButton btn_user_search;
    private JPanel pnl_patika_list;
    private JScrollPane scrl_patika_list;
    private JTable tbl_patika_list;
    private JPanel pnl_patika_add;
    private JTextField fld_patika_name;
    private JButton btn_patika_add;
    private JPanel pnl_course_list;
    private JScrollPane scrl_course_list;
    private JTable tbl_course_list;
    private JPanel pnl_course_add;
    private JTextField fld_course_name;
    private JTextField fld_course_lang;
    private JComboBox cmb_course_patika;
    private JComboBox cmb_course_user;
    private JButton btn_course_add;
    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;
    private DefaultTableModel mdl_patika_list;
    private Object[] row_patika_list;
    private JPopupMenu patikaMenu;
    private DefaultTableModel mdl_course_list;
    private Object[] row_course_list;

    public OperatorGUI(Operator operator){
        this.operator = operator;
        Helper.setLayout();
        add(wrapper);
        setSize(1000,500);
        int x = Helper.screenCenterPoint("x",getSize());
        int y = Helper.screenCenterPoint("y",getSize());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText("Hosgeldin : " + operator.getName());

        // ModelUSerList
        mdl_user_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                if (column==0){
                    return false;
                }
                return super.isCellEditable(row,column);
            }
        };
        Object[] col_user_list = {"ID", "Ad Soyad","Kullanici Adi", "Sife" ,"Uyelik Tipi"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        row_user_list = new Object[col_user_list.length];
        loadUserModel();


        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false);

        tbl_user_list.getSelectionModel().addListSelectionListener(e -> {
            try{
                String  select_user_id = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),0).toString();
                fld_user_id.setText(select_user_id);
            }catch (Exception exception){

            }

        });

        tbl_user_list.getModel().addTableModelListener(e -> {
            if (e.getType() ==  TableModelEvent.UPDATE){
                int user_id = Integer.parseInt(tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),0).toString());
                String user_name = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),1).toString();
                String user_uname = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),2).toString();
                String user_pass = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),3).toString();
                String user_type = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(),4).toString();

                if (User.update(user_id,user_name,user_uname,user_pass,user_type))
                    Helper.showMessage("done");
                    loadUserModel();
                    loadEducator();
                    loadCourseModel();

            }else {
                Helper.showMessage("error");
            }
        });
        // ## UserList

        // PatikaList
        patikaMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        patikaMenu.add(updateMenu);
        patikaMenu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int select_id = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0).toString());
            UpdatePatikaGUI updateGUI = new UpdatePatikaGUI(Patika.getFetch(select_id));
            updateGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPatikaModel();
                    loadPatikaCombo();
                    loadCourseModel();;
                }
            });
        });

        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")){
                int select_id = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(),0).toString());
                if (Patika.delete(select_id)){
                    Helper.showMessage("done");
                    loadPatikaModel();
                    loadPatikaCombo();
                }else {
                    Helper.showMessage("error");
                }
            }
        });

        mdl_patika_list = new DefaultTableModel();
        Object[] col_patika_list= {"ID","Patika Adı"};
        mdl_patika_list.setColumnIdentifiers(col_patika_list);
        row_patika_list = new Object[col_patika_list.length];
        loadPatikaModel();
        loadPatikaCombo();
        loadEducator();
        tbl_patika_list.setModel(mdl_patika_list);
        tbl_patika_list.setComponentPopupMenu(patikaMenu);
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(75);

        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point =e.getPoint();
                int selected_row = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selected_row,selected_row);
            }
        });
        //## PatikaList

        //CourseList
        mdl_course_list = new DefaultTableModel();
        Object[] col_courseList = {"ID","Ders Adı","Programlama Dili","Patika","Eğitmen"};
        mdl_course_list.setColumnIdentifiers(col_courseList);
        row_course_list = new Object[col_courseList.length];
        loadCourseModel();
        tbl_course_list.setModel(mdl_course_list);
        tbl_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_course_list.getTableHeader().setReorderingAllowed(false);
        loadPatikaCombo();
        loadEducator();

        // ## CourseList
        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_name)|| Helper.isFieldEmpty(fld_user_uname)|| Helper.isFieldEmpty( fld_user_pass)){
               Helper.showMessage("fill");
            }
            else {
                String  name = fld_user_name.getText();
                String  username = fld_user_uname.getText();
                String  pass = fld_user_pass.getText();
                String  type = cmb_user_type.getSelectedItem().toString();
                if (User.add(name,username,pass,type)){
                    Helper.showMessage("done");
                    loadUserModel();
                    loadEducator();
                    fld_user_name.setText(null);
                    fld_user_uname.setText(null);
                    fld_user_pass.setText(null);
                }
            }
        });
        btn_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_id)){
                Helper.showMessage("fill");
            }else {
               if (Helper.confirm("sure")){
                   int user_id = Integer.parseInt(fld_user_id.getText());
                   if (User.delete(user_id)){
                       Helper.showMessage("done");
                       loadUserModel();
                       loadEducator();
                       loadCourseModel();
                       fld_user_id.setText(null);
                   }else{
                       Helper.showMessage("error");
                   }
               }
            }
        });
        btn_user_search.addActionListener(e -> {
        String name = fld_search_user_name.getText();
        String username = fld_search_user_username.getText();
        String type = cmb_search_user_type.getSelectedItem().toString();
        String query = User.searchQuery(name,username,type);
        ArrayList<User> searchingUser = User.searchUSerList(query);
        loadUserModel(searchingUser);
        });
        btn_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });
        btn_patika_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)){
                Helper.showMessage("fill");
            }else{
                if (Patika.add(fld_patika_name.getText())){
                    Helper.showMessage("done");
                    loadPatikaModel();
                    loadPatikaCombo();
                    fld_patika_name.setText(null);
                }else{
                    Helper.showMessage("error");
                }
            }
        });
        btn_course_add.addActionListener(e -> {
            Item patikaItem = (Item) cmb_course_patika.getSelectedItem();
            Item userItem = (Item) cmb_course_user.getSelectedItem();
            if (Helper.isFieldEmpty(fld_course_name) || Helper.isFieldEmpty(fld_course_lang)){
                Helper.showMessage("fill");
            }else{
                if (Course.add(userItem.getKey(),patikaItem.getKey(),fld_patika_name.getText(),fld_course_lang.getText())){
                    Helper.showMessage("done");
                    loadCourseModel();
                }else{
                    Helper.showMessage("error");
                }
            }
        });
    }

    private void loadCourseModel() {
    DefaultTableModel clearModel = (DefaultTableModel) tbl_course_list.getModel();
    clearModel.setRowCount(0);
    int i = 0;
    for (Course obj: Course.getList()){
        i = 0;
        row_course_list[i++] = obj.getId();
        row_course_list[i++] = obj.getName();
        row_course_list[i++] = obj.getLanguage();
        row_course_list[i++] = obj.getPatika().getName();
        row_course_list[i++] = obj.getEducator().getName();
        mdl_course_list.addRow(row_course_list);
    }
    }

    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Patika obj : Patika.getList()){
            i = 0;
            row_patika_list[i++] = obj.getId();
            row_patika_list[i++] = obj.getName();
            mdl_patika_list.addRow(row_patika_list);
        }
    }

    public void loadUserModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);

        for (User obj : User.getList() ){
            int i = 0;
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUsername();
            row_user_list[i++] = obj.getPass();
            row_user_list[i++] = obj.getType();
            mdl_user_list.addRow(row_user_list);
        }
        }
    public void loadUserModel(ArrayList<User> list){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);

        for (User obj : list ){
            int i = 0;
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUsername();
            row_user_list[i++] = obj.getPass();
            row_user_list[i++] = obj.getType();
            mdl_user_list.addRow(row_user_list);
        }}

    public void loadPatikaCombo(){
        cmb_course_patika.removeAllItems();
        for (Patika obj : Patika.getList()){
            cmb_course_patika.addItem(new Item(obj.getId(), obj.getName()));
        }
    }
    public void loadEducator(){
        cmb_course_user.removeAllItems();
        for (User obj : User.getList()) {
            if (obj.getType().equals("educator")) {
                cmb_course_user.addItem(new Item(obj.getId(), obj.getName()));
            }
        }
    }
    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator(1,"Musab Olug","musabolug","12345","student");
        OperatorGUI opGUI = new OperatorGUI(op);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
