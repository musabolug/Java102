package InsuranceManagementSystem;

import java.util.Comparator;
import java.util.List;

public abstract class Account implements Comparable<Account> {
    //"Account" sınıfında müşteri bilgilerini ekrana yazdıran "final" tipinde,
    // değer döndürmeyen ve ismi "showUserInfo" bir fonksiyon tanımlayınız.


    //"Account" sınıfında müşterilerin yaptırdıkları sigortaları liste halinde saklayınız.
    // Sigortayı temsil eden "Insurance" isminde bir soyut sınıf tasarlayınız. Bu soyut sınıf içinde

    //"Account" sınıfında müşterilerin yaptırdıkları sigortaları liste halinde saklayınız.

    //kullanıcının login olma durumu (AuthenticationStatus)
    //kullanıcı nesnesi (User)
    //kullanıcının yaptırmış olduğu sigortaların listesi (ArrayList)


    //AuthenticationStatus tipinde bir enum tanımlayınız.
    // Enum içinde SUCCESS ve FAIL isminde iki tane sabit tanımlayın.
    // SUCCESS login işlemi başarılı ise kullanılacaktır. FAIL ise login olmamışsa kullanılacaktır.


    //kullanıcının sigorta poliçesi ekleyebilmesi için soyut (abstract) bir fonksiyon tanımlanacaktır.
    // Bu soyut sınıf "Individual" ve "Enterprise" isimli alt sınıflarda override edilerek doldurulacaktır.
    // Çünkü, bireysel ve kurumsal müşterilerin ekledikleri paketlerin fiyatlarına uygulanan kar marjı farklı olacaktır.


    //"Account" sınıfından nesneleri TreeSet içinde tutacağımız için "Comparable" interface'den kalıtım almış olmasın
    // a dikkat edin. Ayrıca, "Account" sınıfının "hashCode" ve "equals" fonksiyonlarını doldurmayı unutmayın.

    enum AuthenticationStatus(SUCCESS,FAIL);
    private User user;
    private List<Insurance> insurances;
    private AuthenticationStatus status;

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public List<Insurance> getInsurances(){
        return insurances;
    }
    public void setInsurances(List<Insurance> insurances){
        this.insurances=insurances;
    }
    public AuthenticationStatus getStatus(){
        return status;
    }
    public void setStatus(AuthenticationStatus status){
        this.status = status;
    }

    public final showUserInfo(){
        System.out.println("Account Information:"+
                "\nName : "+user.getName()+
                "\nSurname : "+user.getSurName()+
                "\nEmain : "+user.getEmail()+
                "\nProfefssion : "+user.getProfession()+
                "\nAge : " +user.getAge()+
                "\nLast Entery Date : "+user.getLastLogin());
        for (Adress adress : user.getAdress()){
            System.out.println(adress.getAdress());
        }

    }




    public void login(String email, String password){

    }



}
