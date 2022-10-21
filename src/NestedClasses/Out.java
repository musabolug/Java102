package NestedClasses;
// Outer class
public class Out {
    public int a = 5;
    public static int b= 30;
    // Inner Class
    public static class In{
        public static int a = 10;
        public static void run(){
            System.out.println("In sınıfına ait run metodu çalıştı");
            int a = 1;
            System.out.println(a);// 1
          //  System.out.println(this.a);//10
         //   System.out.println(Out.this.a);//5
            System.out.println(In.a); // 10
            System.out.println(Out.b); // Static Kullanımı ve 20 yazdırır
        }
    }
    public   void run(){
        In in = new In();
        in.run();
    }
 /*   public In getIn(){
        In in = new In();
        return in();
    }**/
}
