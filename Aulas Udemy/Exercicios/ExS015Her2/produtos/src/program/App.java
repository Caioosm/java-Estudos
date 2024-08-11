package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        
        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Produto n°" + i + "Dados:");
            System.out.print("Comum, usado ou importado(c, u, i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Preço: ");
            Double price = sc.nextDouble();

            if (ch == 'c') {
                list.add(new Product(name, price));
            }else if (ch == 'u') {
                System.out.print("Data de fabricação(MM/DD/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/mm/yyyy"));
                list.add(new UsedProducts(name, price, data));
            }else{
                System.out.print("Custo da importação: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee)); 
            }
        }

        System.out.println();
        System.out.println("---------------------ETIQUETAS DE PRECO---------------------");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
