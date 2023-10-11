package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    public static void addShape(ArrayList<Shape> shapes, Shape shape) {
        shapes.add(shape);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public static double totalArea(ArrayList<Shape> shapes) {
        double areaOfAllShapes = 0.0;
        System.out.println("The total area of all shapes is: ");
        for (Shape shape : shapes) {
            areaOfAllShapes += shape.getArea();
        }
        return areaOfAllShapes;
    }
}
