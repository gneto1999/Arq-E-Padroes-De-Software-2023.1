public abstract class Client {
    protected Discount d;
    public abstract Discount createDiscount();

    public void newDiscount() {
        this.d = createDiscount();
        d.discount();
    }
}
