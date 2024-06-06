package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Alturas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas a serem digitadas? ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];
        
        //parte que coleta informações das pessoas
        System.out.println("-----------Informações-----------");
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:" );
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoas(name, altura, idade);
        }

        //Calculo da média altura
        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i].getAltura();
        }
        double mediaAltura = soma / vect.length;
        System.out.printf("Media da altura: %.2f%n", mediaAltura);

        //Calculo percentual de menores de 16 anos
        int nmenores = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                nmenores++;      
            }
        }
        double percentualMenores = ((double)nmenores / n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percentualMenores);

        //nome das pessoas com menos de 16 anos
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
