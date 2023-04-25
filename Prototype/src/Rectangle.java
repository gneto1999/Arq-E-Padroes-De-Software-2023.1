public class Rectangle implements Prototype {
    private double width;
    private double height;
    private String backgroundColor;

    public Rectangle(double width, double height, String backgroundColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(width, height, backgroundColor);
    }

    @Override
    public String toString() {
        return "width: " + width + ", height: " + height + ", background color: " + backgroundColor;
    }
}
