package InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStream {
    public static void main(String[] args) {

       // ByteArrayInputStream
     /*   byte[]  dizi = {1,2,3,4,56};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi,     2,5);//sadece dizi de yazılabilir
        System.out.println("Kullanilabilen byte sayisi : "+input.available());
        int i = input.read();
        while (i != -1){
            System.out.print(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        // ByteArrayOutputStream
        String data = "Java 102 Dersleri ";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray =data.getBytes();
        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Cikis Akisi : " +newData);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
