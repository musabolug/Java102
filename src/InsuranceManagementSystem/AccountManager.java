package InsuranceManagementSystem;

import InsuranceManagementSystem.*;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> users = new TreeSet<>();

    public void addUsers() throws ClassCastException {
        Address address = new HomeAddress("Istanbul", "Usküdar", "Leylak Sokak", "Ata 2 sitesi leylak sokak ");
        User user1 = new User("Musab", "Olug", "musabolug@gmail.com", "123", "Backend Dev", 23, address, "Individual");
        Account account = new Individual(user1);

        Address address2 = new HomeAddress("Van", "Merkez", "Lale Sokak", "lale sokak no 46 van merkez");
        User user2 = new User("Ali", "Veli", "aliveli@gmail.com", "456", "doktor", 43, address2, "Enterprise");
        Account account2 = new Enterprise(user2);
        users.add(account);
        users.add(account2);
    }

    public Account login(String email, String password) {
        addUsers();
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("Sifre veya email yanlıs girildi!");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
