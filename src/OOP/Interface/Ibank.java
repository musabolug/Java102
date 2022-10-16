package OOP.Interface;

public interface Ibank {
    final String hostIpAdress = "127.0.0.1";

    boolean connect(String IpAdress);

    boolean payment(double price, String cardNo, String expirationDate, String cvc);
}
