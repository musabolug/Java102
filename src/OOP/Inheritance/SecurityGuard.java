package OOP.Inheritance;

public class SecurityGuard extends Officer{
    String document;
    public  SecurityGuard (String nameSurname, String phoneNo, String email, String department, String shift,String document){
        super(nameSurname, phoneNo, email, department, shift);
        this.document = document;
    }
    public void watch(){
        System.out.println(this.getNameSurname()+ "is on the watch ");
    }
}
