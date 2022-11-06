package InputOutput;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class BufferedStram {
    public static void main(String[] args) {
        /*try{
            FileInputStream fileInputStream = new FileInputStream("InputOutput/patika.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i = bufferedInputStream.read();
            while (i!=-1){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }*/
        try {
            String data = "Java 102  Patikasi";
            FileOutputStream file = new FileOutputStream("InputOutput/patika.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(file);

            byte[] byteArray = data.getBytes();

            bufferedOutputStream.write(byteArray);
            bufferedOutputStream.close();
            file.close();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
