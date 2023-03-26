public abstract class CondimentDecorator implements Pizza {
    protected Pizza pizza;

    public CondimentDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
