package OOP.Inheritance;

public class Teacher extends Academist{
    private String doorNo;
    public Teacher(String nameSurname,String phoneNo, String email,String doorNo){
        super(nameSurname, phoneNo, email);
        this.doorNo = doorNo;
    }
}
