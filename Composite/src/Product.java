public class Product implements ProductComponent {
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    @Override
    public void add(ProductComponent productComponent) {
    }

    @Override
    public void print() {
        System.out.println(productName + ", $" + price);
    }

    @Override
    public void remove(ProductComponent productComponent) {
    }

    @Override
    public double total() {
        return price;
    }
}
