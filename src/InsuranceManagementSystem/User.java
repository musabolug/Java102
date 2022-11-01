package InsuranceManagementSystem;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private Date lastLogin = null;


    private ArrayList<Adress> adress ;
    public User(String name, String surName,String email, String password ,String profession,int age){
        this.name =name;
        this.surName =surName;
        this.email = email;
        this.password = password;
        this.profession=profession;
        this.age =age;
        this.adress = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Date getLastLogin(){
        return lastLogin;
    }
    public void setLastLogin(Date lastLogin){
        this.lastLogin = lastLogin;
    }
    public ArrayList<Adress> getAdress(){
        return adress;
    }
}
