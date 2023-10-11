package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ShapeBuilder database = new ShapeBuilder();

        Circle circle = new Circle(2);
        Square square = new Square(5);
        Square square1 = new Square(10);

        circle.getArea();
        square.getArea();
        square1.getArea();

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(square1.getArea());

        ShapeBuilder.addShape(database.getShapes(),circle);
        ShapeBuilder.addShape(database.getShapes(),square);
        ShapeBuilder.addShape(database.getShapes(),square1);

        System.out.println(ShapeBuilder.totalArea(database.getShapes()));

    }
}
