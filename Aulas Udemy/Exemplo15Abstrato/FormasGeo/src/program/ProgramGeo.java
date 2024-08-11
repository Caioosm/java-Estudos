package program;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class ProgramGeo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Entre com o número de formas: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Figura #" + i + " data:");
            System.out.print("Retangulo ou circulo(r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Cor (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                Double width = sc.nextDouble();
                
                System.out.print("Altura: ");
                Double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            }else{
                System.out.print("Raio: ");
                Double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }


        System.out.println();
        System.out.println("Areas Shape");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));
        }
        
        sc.close();
    }
}
