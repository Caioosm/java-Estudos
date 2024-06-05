//Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas
package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = scan.nextInt();
        double[] vect = new double[n];
        
        System.out.println("Digite a altura delas: ");
        for(int i = 0; i < n; i++){
            vect[i] = scan.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.printf("Média das alturas: %.2f", avg) ;

        scan.close();
    }
}
