public class MaioneseCondiment extends CondimentDecorator {
    public MaioneseCondiment(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " - Maionese";
    }

    @Override
    public double price() {
        return pizza.price() + 1.50;
    }
}
