package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.domain.Contract;
import Model.domain.Installment;
import Model.entities.ContractService;
import Model.entities.PaypalService;

public class ProgramInterfaces {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();
        
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, parcelas);
        
        System.out.println("PARCELAS: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
