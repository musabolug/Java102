package OOP.Abstraction;

public class Employee {
    private String nameSurname;
    private String phoneNo;
    private String email;

    public Employee(String nameSurname, String phoneNo , String email){
        this.nameSurname = nameSurname;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public String getPhoneNo(){
        return  phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getEmail(){
        return email;
    }
    public void  setEmail(String email){
        this.email = email;
    }

    public void enterance(){
        System.out.println(this.nameSurname+ " entered the University !!");
    }
    public void enterance(String enteranceTime){ //OVERLOADİNG
        System.out.println(this.getNameSurname() +" entered at " +enteranceTime);
    }
    public void exit(){
        System.out.println(this.nameSurname + " exit from University !!");
    }

    public void diningHall() {
        System.out.println(this.nameSurname + " entered the dining hall !!");
    }

    public static void loginUsers(Employee[] loginUsers){
        for (Employee c :loginUsers) {
            c.enterance();
        }
    }
}

