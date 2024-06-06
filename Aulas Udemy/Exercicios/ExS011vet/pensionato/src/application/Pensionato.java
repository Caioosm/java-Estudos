package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Pensionato {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Quantos quartos vão ser alugados?");
        int n = scan.nextInt();
        Estudantes[] quartos = new Estudantes[10];

        //coletando informações dos estudantes
        System.out.println("-------------Dados dos Estudantes-------------");
        for(int i = 0; i < n; i++){
            scan.nextLine();
            System.out.println("Dados do " + (i + 1) + "o estudante: ");
            
            System.out.print("Nome: ");
            String name = scan.nextLine();
            
            System.out.print("Email: ");
            String email = scan.next();
            
            System.out.print("Quarto: ");
            int NumQuarto = scan.nextInt();
            
            quartos[NumQuarto] = new Estudantes(name, email);
        }
        //Impressão de dados dos Estudantes
        
        System.out.println();
        System.out.println("-------------Quartos Alugados:-------------");
        for(int i = 0 ; i < 10; i++){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }
        scan.close();
        
    }
}
