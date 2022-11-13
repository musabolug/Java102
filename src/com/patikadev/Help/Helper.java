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
}
