package com.patikadev.View;

import com.patikadev.Help.Config;
import com.patikadev.Help.Helper;
import com.patikadev.Model.Operator;
import com.patikadev.Model.User;

import javax.swing.*;

public class LoginGUI extends JFrame{
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_user_username;
    private JPasswordField fld_user_pass;
    private JButton btn_login;

    public LoginGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        btn_login.addActionListener(e ->{
            if (Helper.isFieldEmpty(fld_user_pass)||Helper.isFieldEmpty(fld_user_pass)){
                Helper.showMessage("fill");
            }else{
                User u = User.getFetch(fld_user_username.getText(),fld_user_pass.getText());
                if (u == null){
                    Helper.showMessage("Kullanıcı Bulunamadı");
                }else{
                    switch (u.getType()){
                        case "operator":
                            OperatorGUI operatorGUI = new OperatorGUI((Operator) u);
                            break;
                        case "student":
                            StudentGUI studentGUI = new StudentGUI();
                            break;
                        case "educator":
                            EducatorGUI educatorGUI = new EducatorGUI();
                            break;

                    }
                    dispose();
                }
                }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI login = new LoginGUI();

    }
}
