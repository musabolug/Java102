package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderAndWriter {
    public static void main(String[] args) {
       /* FileReader readFile;

        {
            try {
                readFile = new FileReader("InputOutput/patika.txt", Charset.forName("Big5"));
                int i = readFile.read();
                while (i!= -1){
                    System.out.print((char) i);
                    i=readFile.read();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/


        //FİLE WRİTER EN KULLNIŞLISI

        String data = "JAVA ÖĞRENİYÖRÜMŞ" ;
        try {
            FileWriter writer = new FileWriter("InputOutput/output.txt");
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }

}
