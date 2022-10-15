package OOP.Inheritance;

import java.awt.desktop.SystemEventListener;

public class Assistant extends Academist{
   private  String officeHour;
    public Assistant(String nameSurname, String phoneNo, String email,String officeHour){
        super(nameSurname, phoneNo, email);
        this.officeHour = officeHour;
    }
    public String getOfficeHour(){
        return this.officeHour;
    }
    public void setOfficeHour(String officeHour){
        this.officeHour = officeHour;
    }
    public void makeQuiz(){
        System.out.println(this.getNameSurname()+" making quiz");
    }
}
