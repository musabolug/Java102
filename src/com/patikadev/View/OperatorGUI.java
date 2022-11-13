package com.patikadev.View;

import com.patikadev.Help.Config;
import com.patikadev.Help.Helper;
import com.patikadev.Model.Operator;

import javax.swing.*;

public class OperatorGUI extends JFrame {
    private final Operator operator;
    private  JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JButton btn_logout;
    private JPanel pnl__user_list;
    private JScrollPane scrl_user_list;
    private JTable table1;

    public OperatorGUI(Operator operator){
        this.operator = operator;
        Helper.setLayout();
        add(wrapper);
        setSize(1000,1000);
        int x = Helper.screenCenterPoint("x",getSize());
        int y = Helper.screenCenterPoint("y",getSize());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText("Hosgeldin : " + operator.getName());
    }
    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Musab Olug");
        op.setPass("12345");
        op.setUsername("musabolug");

        OperatorGUI opGUI = new OperatorGUI(op);
    }



}
