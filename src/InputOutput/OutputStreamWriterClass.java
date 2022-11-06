package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterClass {

    //n OutputStreamWriter sınıfı, karakter biçimindeki verileri bayt biçimindeki verilere dönüştürmek için
    // kullanılabilir. Writer soyut sınıfını genişletir.
    public static void main(String[] args) {
        String data ="ĞÜİŞ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("InputOutput/output.txt");

            OutputStreamWriter fileWriter= new OutputStreamWriter(fileOutput);
            System.out.println(fileWriter.getEncoding());
            fileOutput.write(data.getBytes());//StandardCharsets.UTF_8
            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }
}
