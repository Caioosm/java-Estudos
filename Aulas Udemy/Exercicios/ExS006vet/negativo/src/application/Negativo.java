package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números vc vai digitar?");
        int n = scan.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scan.nextInt();
        }
        
        System.out.println("Numeros negativos: ");
        for(int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        
        scan.close();
    }
}
