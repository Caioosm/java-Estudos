package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        //regristro de dados
        System.out.print("Quantos empregados vão ser registrados? ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Empregado #" + (i + 1) + ": ");

            System.out.print("Id: ");
            Integer id = scan.nextInt();

            //verificação da existência do ID
            while(hasId(list, id)){
                System.out.print("Este ID já está sendo usando! tente outro: ");
                id = scan.nextInt();
            }
            scan.nextLine();
            System.out.print("Nome: ");
            String name = scan.nextLine();

            System.out.print("Salário: ");
            Double salary = scan.nextDouble();
            //Instanciamento do objeto para adicionar os dados a lista
            list.add(new Employee(id, name, salary));
        }
        
        //Atualizando o salário do funcionário
        System.out.println();
        System.out.print("Digite o ID do funcionário para receber o aumento salarial: ");
        int id = scan.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //verificação da existencia do ID para o  aumento de salário
        if(emp == null){
            System.out.println("Este ID não existe!");
        }else{
            System.out.print("Digite a porcentagem de aumento: ");
            double percentage = scan.nextDouble();
            emp.increaseSalary(percentage);
        }

        //impressão dados dos funcionários
        System.out.println();
        System.out.println("Lista dos empregados: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        
        scan.close();
    }
    //Função auxiliar para verificar se há um ID existente
    static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
