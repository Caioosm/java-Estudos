package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Instanciamento do tipo ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Instanciamento do tipo ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //instanciamento data-hora global customizada

        LocalDate pastWeek = d04.minusDays(7); 
        LocalDate NextWeek = d04.plusDays(7); 
        
        System.out.println("PastWeek = " + pastWeek);
        System.out.println("NextWeek = " + NextWeek);
        
        LocalDateTime pastWeekTime = d05.minusDays(7); 
        LocalDateTime NextWeekTime = d05.plusDays(7); 
        
        System.out.println("pastWeekTime = " + pastWeekTime);
        System.out.println("NextWeekTime = " + NextWeekTime);
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); 
        Instant NextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        
        
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("NextWeekInstant = " + NextWeekInstant);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }
}
