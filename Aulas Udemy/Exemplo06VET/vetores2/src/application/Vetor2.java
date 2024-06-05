//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos produtos deseja colocar? ");
        int n = scan.nextInt();
        Product[] vect = new Product[n];
        System.out.println("Produtos: ");

        for(int i = 0; i < vect.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0.0;

        for(int i = 0; i < vect.length ; i++){
            soma += vect[i].getPrice();
        }

        double avg = soma / vect.length;

        System.out.printf("Média dos preços: %.2f%n", avg);


        scan.close();
    }
}
