import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Taxas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Entre com o número de pagadores de taxas (faz o L): ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Pagador de taxa n°" + i);
            System.out.print("Individual ou compania(i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Ganho anual: ");
            Double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Gastos com saúde: ");
                Double healthExpeditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpeditures));
            }else{
                System.out.print("Numero de funcionários: ");    
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        Double sum = 0.0;
        System.out.println();
        System.out.println("TAXAS PAGAS (FAZ O L FILHO DA PUTA KKKKKKKKKKKKKKKKK)");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName()+ ": $" + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("Total de taxas (kkkkkkkkkkkkkkkkk): " + String.format("%.2f", sum));

        sc.close();
    }
}
