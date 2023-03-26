public class BadClient extends Client {
    @Override
    public Discount createDiscount() {
        return new BadDiscount();
    }
}
