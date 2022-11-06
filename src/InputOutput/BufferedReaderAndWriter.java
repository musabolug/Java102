package InputOutput;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {

        // EN ÇOK KULLANILANLAR
        // BUFFERED READER
     /*   try{
            FileReader reader = new FileReader("InputOutput/output.txt");
            BufferedReader readBuff =  new BufferedReader(reader);
       /*     String line = readBuff.readLine();
            while (line!= null){
                System.out.println(line);
                line = readBuff.readLine();
            }
*/
       /*     String line ;
            while ((line = readBuff.readLine()) != null){
                System.out.println(line);

            }

        }catch (Exception e){
            System.out.print(e.getMessage());
        }*/

        //BUFFERED WRİTER
            String data  = "JAVAÖĞRENİYORUM";
            File file  = new File("InputOutput/output.txt");

        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);

            bufferedWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
