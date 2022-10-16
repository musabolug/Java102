package OOP.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.print("Please enter price :");
        double price = scn.nextDouble();

        System.out.print("Please enter card No :");
        String cardNo = scn.next();

        System.out.print("PLease enter Expiration date");
        String expirationDate = scn.next();

        System.out.print("Please enter Security code :");
        String cvc = scn.next();

        System.out.println("1. Bank A ");
        System.out.println("1. Bank B ");
        System.out.println("1. Bank C ");
        System.out.print("PLease select a Bank :");
        int selectBank = scn.nextInt();

        switch (selectBank){
            case 1 :
                BankA aPos = new BankA("Bank A ","123123123","234234234");
                aPos.connect("127.1,1.1");
                aPos.payment(price,cardNo,expirationDate,cvc);
                break;
            case 2 :
                BankB bPos = new BankB("Bank B","12312312","4651321354651");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNo,expirationDate,cvc);

            default:
                System.out.println("Please select a valid bank");
        }

    }
}
