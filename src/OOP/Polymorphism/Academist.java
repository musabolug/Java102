package OOP.Polymorphism;

public class Academist extends Employee {
    public Academist (String nameSurname, String phoneNo, String email){
        super (nameSurname,phoneNo,email);
    }
    public void enterClass(){
        System.out.println(this.getNameSurname() + " entered the class");
    }

    @Override
    public void enterance() {
        System.out.println(this.getNameSurname() +" Academist entered from door A ");
    }
}
