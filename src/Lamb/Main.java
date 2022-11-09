package Lamb;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable sinifi");
            }
        };
        //LAMBDA EXPRESSİON
        Runnable r2 = () -> {
            System.out.println("r2 sinifi");
        };
        r2.run();

        Runnable r3 = () -> System.out.println("r3 sinifi");
        r3.run();

        Mathematic toplama = new Mathematic() {
            @Override
            public int transection(int a, int b) {
               return a+b;
            }
        }   ;

        Mathematic cikarma = new Mathematic() {
            @Override
            public int transection(int a, int b) {
                return a-b ;
            }
        };

        Mathematic carpma = new Mathematic() {
            @Override
            public int transection(int a, int b) {
                return a*b;
            }
        };

        Mathematic bolme = new Mathematic() {
            @Override
            public int transection(int a, int b) {
                return a/b;
            }
        };

        // Ustteki onca sey yerine sadece LAMB EXPRESSİON kullanarak

        Mathematic toplama1 =(a,b) -> a+b;
        Mathematic cikarma1 = (a,b) -> a-b;
        Mathematic carpma1 = (a,b) -> a*b;
        Mathematic bolme1 = (a,b) -> a/b;

        System.out.println(toplama.transection(10,2));
        System.out.println(cikarma.transection(20,10));
        System.out.println(carpma.transection(3,5));
        System.out.println(bolme.transection(4,2));

        System.out.println(toplama.transection(10,2));
        System.out.println(cikarma.transection(20,10));
        System.out.println(carpma.transection(3,5));
        System.out.println(bolme.transection(4,2));

    }
}
