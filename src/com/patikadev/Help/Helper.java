package com.patikadev.Help;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static int screenCenterPoint (String point, Dimension size){
        int points;
        switch (point){
            case "x":
                points = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case"y":
                points = (Toolkit.getDefaultToolkit().getScreenSize().height -size.height) /2;
                break;
            default:
                points = 0;
        }
        return points;
    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }
    public static void showMessage(String str){

        String msg;
        String title;
        switch (str){
            case "fill":
                msg = "Lütfen tüm alanları doldurunuz! ";
                title = "Hata !";
                optionPaneTR();
                break;
            case "done":
                msg ="İşlem Başarılı !";
                title = "Bildirim";
                break;
            case "error":
                msg = "Bir hata oluştu";
                title = "Hata !";
                break;
            default:
                msg = str;
                title = "Mesaj";
                optionPaneTR();
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(String str){
        String msg;
        switch (str){
            case "sure":
                msg ="Bu işlemi gerçekleştirmek istediğinizden emin misiniz ?";
                break;
            default:
                msg = str;
        }
       return JOptionPane.showConfirmDialog(null,msg,"Son kararın mı ?",JOptionPane.YES_NO_OPTION) == 0;

    }
    public static void setLayout(){
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ){
            if ("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }
    public static void optionPaneTR(){
        UIManager.put("OptionPane.okButtonText" , "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText","Hayır");

    }
}
