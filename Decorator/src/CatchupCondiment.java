public class CatchupCondiment extends CondimentDecorator {
    public CatchupCondiment(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " - Catchup";
    }

    @Override
    public double price() {
        return pizza.price() + 0.99;
    }
}
