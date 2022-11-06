package InputOutput;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
      //File file = new File("InputOutput/patika.txt");
        /*try{

            if (file.createNewFile()){
                System.out.print(file.getName()+" is created.");
            }else {
                System.out.print("This file is already exist!");
            }
        }catch (IOException e){
            System.out.print(e.getMessage());
        }*/
     //   file.delete();

       // File file2 = new File("InputOutput/java102/test");
       // System.out.print(file2.mkdirs());// eğer var olan dosya içine bir dosya olusturmak istersen mkdir
        //eğer var olmayan bir dosya içineki var olmayan bir dosyayı olusturmak istersen mkdirs() kullan

        File file3 = new File("InputOutput");
        String[] list = file3.list();
        for (String str : list){
            System.out.println(str);
        }
    }

}
