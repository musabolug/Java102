package OOP.Inheritance;

public class LabAsssistant extends Assistant{
    public LabAsssistant (String nameSurname, String phoneNo, String email,String officeHour){
        super(nameSurname, phoneNo, email, officeHour);
    }
    public void enterLab(){
        System.out.println(this.getNameSurname()+" is entered the lab");
    }
}
