public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaCalabreza();
        pizza = new CatchupCondiment(pizza);
        pizza = new MaioneseCondiment(pizza);
        pizza = new MostardaCondiment(pizza);
        System.out.println(pizza.getDescription() + " \n" + pizza.price());
    }
}