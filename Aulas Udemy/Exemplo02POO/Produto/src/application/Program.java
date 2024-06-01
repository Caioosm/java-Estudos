//pacote da classe principal
package application;
//pacotes de bibliotecas
import java.util.Locale;
import java.util.Scanner;
//Pacotes externos criados(classe Product)
import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product Data: " + product);
        
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
