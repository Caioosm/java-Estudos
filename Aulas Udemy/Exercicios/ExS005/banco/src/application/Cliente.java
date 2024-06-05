package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Nome titular: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Deposito inicial? (s/n)");
        char escolha = sc.next().charAt(0);

        if(escolha == 's'){
            System.out.print("Digite o valor inicial de deposito: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(name, numeroConta, depositoInicial);

        }else{
            account = new Account(name, numeroConta);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        account.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account);

        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        account.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account);

        sc.close();
    }
}
