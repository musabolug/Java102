package NestedClasses;

public class Local {
public void run(){

    // Local Class
    class Yerel{
        private int a;
        public Yerel(int a ){
            this.a = a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    Yerel y =  new Yerel(15);
    System.out.println("Local sinifi calisti");
    System.out.println(y.getA());

}


}



