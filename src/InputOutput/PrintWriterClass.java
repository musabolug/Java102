package InputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {


        String data= "Java 102";
        try {
            PrintWriter writer = new PrintWriter("InputOutput/output.txt");
            writer.println(1231231);// GİRİLEN DEGERİ STRİNG E ÇEVİRİP YAZAR
            writer.println(data);
            writer.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }
}
