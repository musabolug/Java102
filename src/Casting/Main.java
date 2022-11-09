package Casting;

public class Main {
    public static void main(String[] args) {
        //WİEDİNG CASTİNG
        int a = 10;
        double b = a;


        //NARROWİNG CASTİNG
        double pi = 3.14;
        int ab = (int) pi;
        System.out.println(ab);

        // INTEGER => STRİNG
        int num = 20;
        System.out.println("Ingeger deger : "+num);
        String data  = String.valueOf(num);
        System.out.println("String deger : "+ data );

        // STRİNG => INTEGER
        String data1 = "15";
        System.out.println("String deger: "+ data);
        int num1 = Integer.parseInt(data1);
        System.out.println("Integer deger :"+num1);

    }
}
