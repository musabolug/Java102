package com.patika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends  JFrame{

    private JPanel wrapper;
    private JPanel wbottom;
    private JPanel wtop;
    private JTextField fld_username;
    private JButton btn_login;
    private JTextField fld_password;

    public Example(){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
          //  System.out.println(info.getName() + " => " + info.getClassName()); // Temaları ekrana yazdırır
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException e) {

            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
        }
        setContentPane(wrapper);
        setSize(550 ,300);
        setTitle("Uygulama Adi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y =  (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x,y);
        setVisible(true);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Butona Basildi");
                System.out.println(fld_username.getText());
                System.out.println(fld_password.getText());

                if (fld_username.getText().length() == 0 || fld_password.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Tum alanlari doldurun !","Hata",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }


}
