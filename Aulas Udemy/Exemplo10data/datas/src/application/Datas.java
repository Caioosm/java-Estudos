package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) throws Exception {

        // DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now(); // instanciamento de um objeto da data de agora, contendo ano, mês, dia
        LocalDateTime d02 = LocalDateTime.now(); //instanciamento de um objeto da data de agora com horário, contendo ano, mês, dia e horário
        Instant d03 = Instant.now(); //Instanciamento de um objeto data do tipo data-hora global GMT horário de Londres

        LocalDate d04 = LocalDate.parse("2022-07-20"); // Instanciamento do tipo ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Instanciamento do tipo ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Instanciamento do tipo ISO 8601 no padrão UTC no horário de Londres

        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30, 0);

        System.out.println("----------------------");
        System.out.println("d01 = " + d01.toString());
        System.out.println("----------------------");
        System.out.println("d02 = " + d02.toString());
        System.out.println("----------------------");
        System.out.println("d03 = " + d03.toString());
        System.out.println("----------------------");
        System.out.println("d04 = " + d04.toString());
        System.out.println("----------------------");
        System.out.println("d05 = " + d05.toString());
        System.out.println("----------------------");
        System.out.println("d06 = " + d06.toString());
        System.out.println("----------------------");
        System.out.println("d07 = " + d07.toString());
        System.out.println("----------------------");
        System.out.println("d08 = " + d08.toString());
        System.out.println("----------------------");
        System.out.println("d09 = " + d09.toString());
        System.out.println("----------------------");
        System.out.println("d10 = " + d10.toString());
        System.out.println("----------------------");
        System.out.println("d11 = " + d11.toString());
        



    }
}
