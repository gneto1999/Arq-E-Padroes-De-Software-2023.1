public class VipDiscount implements Discount {
    @Override
    public double discount() {
        System.out.println("20% discount");
        return 0.2;
    }
}
