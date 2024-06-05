//pacote da classe principal
package application;
//pacotes de bibliotecas
import java.util.Locale;
import java.util.Scanner;
//Pacotes externos criados(classe Product)
import entities.Product;

public class ProgramProduct {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        // System.out.print("Quantity in Stock: ");
        // int quantity = sc.nextInt();
        Product product = new Product(name, price);

        product.setName("computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(780.50);
        System.out.println("Updated price: " + product.getPrice());

        
        System.out.println();
        System.out.print("Enter the number of products to be added in Stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from Stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + product);

        sc.close();
    }
}
