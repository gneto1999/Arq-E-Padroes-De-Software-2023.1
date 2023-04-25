public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6, "red");
        Circle c1 = new Circle(10, "blue");

        Rectangle r2 = (Rectangle) r1.clone();
        Circle c2 = (Circle) c1.clone();

        System.out.println("Original:");
        System.out.println(r1);
        System.out.println(c2);

        System.out.println();

        System.out.println("Clone:");
        System.out.println(r2);
        System.out.println(c2);
    }
}