package app;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class CuiringaDelimitado {
    public static void main(String[] args) throws Exception {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
