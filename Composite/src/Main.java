public class Main {
    public static void main(String[] args) {
        ProductComponent boxContainer = new Box();

        ProductComponent box1 = new Box();

        ProductComponent box2 = new Box();
        ProductComponent prod1 = new Product(5199.90, "IPhone");
        box2.add(prod1);

        ProductComponent box3 = new Box();
        ProductComponent prod2 = new Product(459.99, "Carregador");
        box3.add(prod2);

        box1.add(box2);
        box1.add(box3);

        boxContainer.add(box1);

        System.out.println(boxContainer.total());
        boxContainer.print();
    }
}
