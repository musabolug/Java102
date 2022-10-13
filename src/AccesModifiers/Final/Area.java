package AccesModifiers.Final;

import java.util.Scanner;

public class Area {
   public int r;
   public final double PI_SAYISI = 3.14;

   //NOT : Sabit tanımlarken isimler büyük harflerle yazılır. Sabit adı birden fazla sözcükten oluşuyorsa,
    // sözcükler altçizgi ( _ ) ile birbirlerinden ayrılır. Örneğin en fazla kayıt sayısını ifade edecek sabitin adı
    // şöyle verilebilir: PATIKA_DEV_JAVA_102

   public Area(int r){
       this.r=r;
   }
    public void calcArea(){
       double area = PI_SAYISI * this.r * this.r;
       System.out.println("Dairenin Alani :" +area);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a r value :");
        int r = scn.nextInt();
        Area area1 = new Area(r);
        area1.calcArea();
    }


}
