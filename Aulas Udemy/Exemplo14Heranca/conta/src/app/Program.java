package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1001, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1007, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1008, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for acc %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        // Account acc1 = new Account(1001, "Alex", 1000.0);
        // acc1.saqque(200.0);
        // System.out.println(acc1.getBalance());

        // Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        // acc2.saqque(200.0);
        // System.out.println(acc2.getBalance());

        // Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
        // acc3.saqque(200.0);
        // System.out.println(acc3.getBalance());

    }
}
