public class Circle implements Prototype {
    private int diameter;
    private String backgroundColor;

    public Circle(int diameter, String backgroundColor) {
        this.diameter = diameter;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Prototype clone() {
        return new Circle(diameter, backgroundColor);
    }

    @Override
    public String toString() {
        return "diameter: " + diameter + ", background color: " + backgroundColor;
    }
}
