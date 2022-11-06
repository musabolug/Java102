package InputOutput;

import java.io.FileInputStream;

public class InputStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("InputOutput/patika.txt");
          /*  int i = input.read();
            while(i!= -1){
                System.out.print((char)i);
                i = input.read();*/
            /*    System.out.print("Kullanilabilir byte sayisi :"+input.available());
            input.read();
            input.read();
            input.read();
            input.read();
            System.out.print("Kullanilabilir byte sayisi :"+input.available());*/

            input.skip(10);
            int i = input.read();
            while (i!=-1){
                System.out.print((char) i);
                i= input.read();
            }

            input.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}