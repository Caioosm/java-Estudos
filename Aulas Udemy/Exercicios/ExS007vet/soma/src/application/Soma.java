package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros vc vai digitar? ");
        int n = scan.nextInt();
        double[] vect = new double[n];
        int i = 0;
        for(i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scan.nextDouble();    
        }

        int soma = 0;
        for(i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        System.out.print("Valores: ");
        for(i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        double media = soma / n;
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.printf("Media: %.2f", media);
        
        scan.close();
        
    }
}
