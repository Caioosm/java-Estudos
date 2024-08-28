package app;

import domain.Pessoa;

public class Program {
    public static void main(String[] args) throws Exception {

        Pessoa p1 = new Pessoa(1,"Carlos da silva" , "carlos@gmail.com");
        Pessoa p2 = new Pessoa(2,"Joaquin Torres" , "joaquin@gmail.com");
        Pessoa p3 = new Pessoa(3,"Ana maria" , "anma@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }
}
