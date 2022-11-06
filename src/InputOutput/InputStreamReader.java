package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.nio.charset.Charset;

public class InputStreamReader {
    public InputStreamReader(FileInputStream fileInput) {
    }

  /*  public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("InputOutput/patika.txt");
            InputStreamReader inputReader = new InputStreamReader(fileInput, Charset.forName("UTF8"));
            System.out.println(inputReader.getEncoding);
            int i = inputReader.read();
            while (i!=-1){
                System.out.print((char) i);
                i = inputReader.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }
    }
*/
}
