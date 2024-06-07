package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Caio");
        list.add("Ana");
        list.add("Alex");
        list.add(2, "Marco");

        System.out.println(list.size());

        
        for (String x : list) {
            System.out.println(x);
        }
        
        //Condição/predicado para remover aqueles nomes que começam com "M"
        System.out.println("---------------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); //Função lambda (predicado)
        
        for (String x : list) {
            System.out.println(x);
        }
        //Maneira de encontrar em que posição está cada nome
        System.out.println("---------------------------");
        System.out.println("Index of Alex: " + list.indexOf("Alex"));
        System.out.println("Index of Caio: " + list.indexOf("Caio"));

        //filtragem na lista para imprimir somente aqueles que começam com a letra "A"
        System.out.println("---------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);
        }
        //FindFirst para encontrar o primeiro elemento da stream que atende ao predicado descrito, ou seja, ele vai pegar o primeiro nome que começa com a letra "A" e imprimir e caso não existir
        //ele vai retornar "null" por conta do método "orElse(null)"
        System.out.println("---------------------------");
        // list.removeIf(x -> x.charAt(0) == 'A');
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("Não encontrado!");
        System.out.println(name);
    }
}
