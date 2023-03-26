public class CommonDiscount implements Discount {
    @Override
    public double discount() {
        System.out.println("5% discount");

        return 0.05;
    }
}
