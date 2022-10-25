package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program basladi");
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try{
            // hata alınması muhtemel yeri try bloğu içine al
            System.out.println("Bolme islemi basladi");
            System.out.println(b/a);
            System.out.println("Bolme islemi bitti");
            c = input.nextInt();
            arr[10] = 10;
        }catch(ArithmeticException e){
            System.out.println("Aritmatik hata algilandi");
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Yanlis veri girildi");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array hatasi algilandi");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Bu kesinlikle yazilacak");
        }
        System.out.println("Program bitti");
    }

}
