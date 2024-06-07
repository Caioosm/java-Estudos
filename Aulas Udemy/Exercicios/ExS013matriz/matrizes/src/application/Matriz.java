package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Linha: ");
        int linha = scan.nextInt();
        System.out.print("Coluna: ");
        int coluna = scan.nextInt();

        int[][] mat = new int[linha][coluna];

        System.out.println("Digite a matriz: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        System.out.print("Qual numero deseja ler? ");
        int x = scan.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Posição " + i + ", " + j + ": ");
                    if(j > 0){
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}
