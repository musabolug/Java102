package WrapperClasses;

import NestedClasses.Out;

public class Main {
    public static void main(String[] args) {

       /* Integer b = 20;
        String str = b.toString();
        Short s = 2;


        String a = "10";
        int b = 20;
        System.out.println(Integer.parseInt(a) + b); // a yı string den integer a çevirir


        */


        // Autoboxing
        int a = 19;
        Integer b = a;//= Integer.valueOf(a);

        // Boxing
        Integer  c = Integer.valueOf(a);


        // AutoUnboxing
        int d = c;// c.intValue();

        //UnBoxing
        int i = c.intValue();
        System.out.println(d);

    }
}
