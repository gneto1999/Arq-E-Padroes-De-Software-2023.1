public class Parallelepiped implements Shape {
    private double height;
    private double length;
    private double width;

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorVolume(this);
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}