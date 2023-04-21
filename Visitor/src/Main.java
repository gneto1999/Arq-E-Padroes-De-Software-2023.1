import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Parallelepiped(3, 6, 5));
        shapes.add(new Cylinder(5, 4));

        Visitor visitor = new VisitorVolume();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}