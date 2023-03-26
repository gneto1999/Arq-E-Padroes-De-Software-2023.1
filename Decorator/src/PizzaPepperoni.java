public class PizzaPepperoni implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza de Pepperoni";
    }

    @Override
    public double price() {
        return 30.99;
    }
}
