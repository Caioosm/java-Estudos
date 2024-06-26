package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();

        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + func);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update Data: " + func);
        sc.close();
    }
}
