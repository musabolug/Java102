package Static.CodeBlock;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Program Basladi");

        User u1 = new User("Musab");
        User u2 = new User("Zubeyir");
        User u3 = new User("Muaz");

        System.out.println("Counter Son Deger :" +User.counter);
        System.out.print("Program Bitti");
    }

}
