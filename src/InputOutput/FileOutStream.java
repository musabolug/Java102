package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
    public static void main(String[] args) {
        String text = "I am learning OutputStream.\nPatika.dev";
        try {
            File file = new File("patika.txt");
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] textByte = text.getBytes();
            outputStream.write(textByte);
            outputStream.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}
