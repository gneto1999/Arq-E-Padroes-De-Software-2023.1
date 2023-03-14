package Command;

public class Cliente {
    public static void main(String[] args) {
        InvokerSingleton.getInstance().invoke("A");
        InvokerSingleton.getInstance().invoke("B");
    }
}
