package app;

// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Demo2 {
    public static void main(String[] args) throws Exception {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("NoteBook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }

    }
}
