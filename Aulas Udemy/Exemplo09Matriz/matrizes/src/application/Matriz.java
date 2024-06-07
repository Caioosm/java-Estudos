package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tamanho da matriz: ");
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("-------------------");
        for(int i = 0; i<matriz.length; i++){// Percorre a LINHA
            for(int j = 0; j < matriz[i].length; j++){ // Percorre a COLUNA
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int count = 0;

        for(int i = 0; i<matriz.length; i++){// Percorre a LINHA
            for(int j = 0; j < matriz[i].length; j++){ // Percorre a COLUNA
                if(matriz[i][j] < 0){
                    count ++;
                }
            }
        }
        System.out.println("Numeros negativos: " + count);

        scan.close();
    }
}
