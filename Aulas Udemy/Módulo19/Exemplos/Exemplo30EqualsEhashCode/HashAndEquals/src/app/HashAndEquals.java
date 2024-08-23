package app;

import entities.Client;

public class HashAndEquals {
    public static void main(String[] args) throws Exception {

        Client c1 = new Client("Maria", "MARIA@gmail.com");
        Client c2 = new Client("Maria", "MARIA@gmail.com");

        String s1 = "teste";
        String s2 = "teste";

        System.out.println(s1 == s2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2);
    }
}
