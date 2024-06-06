package application;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        int contador = 0;
        System.out.println("Numeros pares: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i]%2 == 0){
                System.out.print(vect[i] + " ");

                contador++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + contador);

        sc.close();
    }
}
