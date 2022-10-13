package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("Lord Of The Rings",900);
        Book silmarillion = new Book("Silmarillion" , 620);


        System.out.println(silmarillion.getName()+" "+silmarillion.getPageNumber());


    }
}
