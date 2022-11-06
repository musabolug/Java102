package InputOutput;
import java.io.*;

public class ObjectStram {
    public static void main(String[] args) {
         Car c1 = new Car("Mercedes","Amg");

        try  {
         //   FileOutputStream fileOutputStream = new FileOutputStream("InputOutput/car.txt");
         //   ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
         //   output.writeObject(c1);
            FileInputStream inputStream = new FileInputStream("InputOutput/car.txt");
           ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
           Car newCar= (Car) inputStream1.readObject();
           System.out.println(newCar.getName());
           System.out.print(newCar.getModel());
           inputStream1.close();
           inputStream.close();
          //  output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
