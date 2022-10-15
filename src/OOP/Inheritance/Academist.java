package OOP.Inheritance;

public class Academist extends Employee{
    public Academist (String nameSurname, String phoneNo, String email){
        super (nameSurname,phoneNo,email);
    }
    public void enterClass(){
        System.out.println(this.getNameSurname() + " entered the class");
    }
}
