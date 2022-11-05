package InsuranceManagementSystem;

import java.util.List;
import java.util.*;

import InsuranceManagementSystem.*;



import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    protected Scanner scanner=new Scanner(System.in);
    private User user;
    private ArrayList<Individual> individualList;
    private AuthenticationStatus status=AuthenticationStatus.FAIL;

    enum AuthenticationStatus{
        FAIL,
        SUCCESS;
    }

    public Account(User user){
        this.user=user;
    }

    public void addAddress(){
        AddressManager.addAddress(this.user);
    }
    public void deleteAddress(){
        printAddresses();
        System.out.print("Silmek istediğiniz adresin id numarasını yazın : ");
        int id=scanner.nextInt();
        AddressManager.deleteAddress(user,id);
    }

    public void login(String email,String password,Account account) throws InvalidAuthenticationException {
        if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){
            status=AuthenticationStatus.SUCCESS;
        }
        else throw new InvalidAuthenticationException("Giriş islemi basarisiz.");
    }

    public final void showUserInfo(){
        System.out.println("Kullanici adi soyadi : "+user.getFirstName()+" "+user.getLastName());
        System.out.println("E-mail : "+user.getEmail()+" Meslegi : "+ user.getJob());
        System.out.println("Yas : "+ user.getAge()+" Son giris tarihi : "+ user.getLastEntry()+" Uyelik turu : "+user.getMembership());
        printInsurances();
        printAddresses();
    }
    public void printAddresses(){
        for (Address address: user.getAddressList()){
            address.showAddressInfo();
        }
    }

    public void printInsurances(){
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Sigorta Turu : "+insurance.getName()+", ucreti : "+ insurance.getPrice()+
                    ", Baslangic Tarihi : "+insurance.getStartDate()+", Bitis Tarihi : "+ insurance.getFinishDate());
        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
