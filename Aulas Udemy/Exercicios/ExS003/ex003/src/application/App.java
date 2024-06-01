package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", student.notaFinal());

        if(student.notaFinal() < 60){
            System.out.println("FAILED");
            System.out.printf("Faltando %.2f pontos%n", student.missingPoints());
        }else{
            System.out.println("PASS!");
        }
        sc.close();
    }
}
