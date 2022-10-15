package OOP.Inheritance;

public class Officer extends Employee {
    private String department;
    private String shift;

    public Officer(String nameSurname, String phoneNo, String email, String department, String shift){
        super(nameSurname, phoneNo, email);
        this.department = department;
        this.shift = shift;
    }
    public String getDepartment(){
        return  department;
    }
    public void setDepartment(){
        this.department = department;
    }
    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }
    public  void work (){
        System.out.println(this.getNameSurname()+" doing it's job " );
    }
}
