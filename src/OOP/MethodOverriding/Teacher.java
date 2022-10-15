package OOP.MethodOverriding;

import OOP.MethodOverriding.Academist;

public class Teacher extends Academist {
    private String doorNo;
    public Teacher(String nameSurname, String phoneNo, String email, String doorNo){
        super(nameSurname, phoneNo, email);
        this.doorNo = doorNo;
    }
    public String getDoorNo(){
        return doorNo;
    }
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }
}
