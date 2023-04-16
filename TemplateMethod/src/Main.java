public class Main {
    public static void main(String[] args) {
        Financing sac = new SAC(50000, 0.01, 5);
        System.out.println(sac.totalFinancingAmount());

        Financing price = new Price(10000, 0.02, 5);
        System.out.println(price.totalFinancingAmount());
    }
}