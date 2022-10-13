package Static.CodeBlock;

public class User {
    public String name;
    public static int counter;

    static{
        System.out.println("2. String kod blogu ");
        int random =(int) (Math.random() *10 );
        System.out.println("3. Random sayi : " +random);
        counter = random;
        System.out.println("4. Counter varsayılan deger :" +counter);
    }
    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter yeni deger : " +counter);
    }
}
