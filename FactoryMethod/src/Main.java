public class Main {
    public static void main(String[] args) {
        Client client = new BadClient();
        client.newDiscount();

        client = new CommonClient();
        client.newDiscount();

        client = new VipClient();
        client.newDiscount();
    }
}