public class Main {
    public static void main(String[] args) {
        Button button = new ButtonComputer(new Computer());
        button.on();
        button.off();

        System.out.println();

        button.setDevice(new TV());
        button.on();
        button.off();

        System.out.println();

        button.setDevice(new Radio());
        button.on();
        button.off();
    }
}