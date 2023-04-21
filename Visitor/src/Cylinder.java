public class Cylinder implements Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorVolume(this);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
