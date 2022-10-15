package OOP.Inheritance;

public class IT extends Officer{
    private String job;
    public IT (String nameSurname, String phoneNo, String email, String department, String shift,String job){
        super(nameSurname, phoneNo, email, department, shift);
        this.job = job;
    }
    public String getJob(){
        return this.job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void networkSetup(){
        System.out.println(this.getNameSurname()+ " is setting network");
    }
}
