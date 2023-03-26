public class CommonClient extends Client {
    @Override
    public Discount createDiscount() {
        return new CommonDiscount();
    }
}
