package OOP.Abstraction;

import OOP.Abstraction.Employee;

public abstract class Academist extends Employee {
    public Academist (String nameSurname, String phoneNo, String email){
        super (nameSurname,phoneNo,email);
    }
    public abstract void enterClass(String enterTime);
    @Override
    public void enterance() {
        System.out.println(this.getNameSurname() +" Academist entered from door A ");
    }
}
