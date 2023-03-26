public class BadDiscount implements Discount {
    @Override
    public double discount() {
        System.out.println("2% discount");

        return 0.02;
    }
}
