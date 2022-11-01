package InsuranceManagementSystem;

public interface Adress {
    String getAdress();

    public class HomeAdress implements  Adress{
        private String adress;
        public HomeAdress(String adress){
            this.adress=adress;
        }
        @Override
        public String getAdress(){
            return adress;
        }
        public void setAdress(String adress){
            this.adress=adress;
        }
    }

    public class BusinessAdress implements Adress{
        private String adress;
        public BusinessAdress(String adress){
            this.adress=adress;
        }
        @Override
        public String getAdress(){
            return adress;
        }
        public void setAdress(String adress){
            this.adress=adress;
        }

    }

    public class AdressMenager{
    public static void addAdress(User user,Adress adress){
        user.getAdress().add(adress);
    }
    public static void removeAdress(User user, Adress adress){
        user.getAdress().remove(adress);
    }

    }

}
