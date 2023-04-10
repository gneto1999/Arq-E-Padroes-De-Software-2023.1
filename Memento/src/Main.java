public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        ChangeTextCommand changeTextCommand = new ChangeTextCommand(editor, "Tricolor em toda Terra, amor igual não viu");
        Invoker.invoker(changeTextCommand);
        changeTextCommand = new ChangeTextCommand(editor, "Vence o Fluminense com o verde de esperança");
        Invoker.invoker(changeTextCommand);

        System.out.println();

        Invoker.undo();
        Invoker.undo();
        Invoker.undo();
    }
}