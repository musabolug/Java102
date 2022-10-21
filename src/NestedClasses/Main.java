package NestedClasses;

public class Main {
    public static void main(String[] args) {
/*
        Nested Classes ( İç içe sınıflar)
        - Inner  Class ( iç Sınıflar)
        - static
        - non- static
        - Local Class ( Yerel Sınıf)
        - Anonymus Class  ( Anonim Sınıflar)

        Out o = new Out();
        Out.In inNesnesi = o.getIn();
        inNesnesi.run();*/
       // Out.In.run(); Static

       // Local l = new Local();
       // l.run();

        Anonim a = new Anonim(){
            public int a = 20;//bu kod dizisini silersen anonim sınıfındaki a degerı doner
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim Olarak aYailmis Run Metodu");
                print();

            }
            public void print(){
                System.out.println("Print Metodu");
            }
        }   ;
        a.run();



    }


}
