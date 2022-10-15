package OOP.Abstraction;

public  class Teacher extends Academist {
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
    @Override
    public void enterClass(String time){
        System.out.println("Teacher "+ this.getNameSurname()+" entered the Class at "+time );
    }
}
