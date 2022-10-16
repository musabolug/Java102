package OOP.Interface;

public class BankA implements Ibank{
        private String bankName;
        private String terminalID;
        private String password;

    public BankA(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }
   @Override
    public boolean connect(String ipAddress){
        System.out.println("User ip :" + ipAddress);
        System.out.println("Host ip :"+ this.hostIpAdress);
        System.out.println(this.bankName+" Connected !!");
        return true;
    }
   @Override
    public boolean payment(double price, String cardNumber, String expirationDate, String cvc){
        // ödeme islemi
        System.out.println("Waiting response from Bank  ");
        System.out.println("Operation Successful ");
        return true;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
