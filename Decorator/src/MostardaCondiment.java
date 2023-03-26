public class MostardaCondiment extends CondimentDecorator {
    public MostardaCondiment(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " - Mostarda";
    }

    @Override
    public double price() {
        return pizza.price() + 0.50;
    }
}
