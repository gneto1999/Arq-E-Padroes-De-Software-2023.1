import java.util.Stack;

public class Invoker {
    private static final Stack<Command> commandStack = new Stack<>();

    public static void invoker(Command command) {
        command.execute();
        commandStack.push(command);
    }

    public static void undo() {
        if(!commandStack.empty()) {
            Command command = commandStack.pop();
            command.undo();
        }
    }
}
