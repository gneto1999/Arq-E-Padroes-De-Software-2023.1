public class VipClient extends Client {
    @Override
    public Discount createDiscount() {
        return new VipDiscount();
    }
}
