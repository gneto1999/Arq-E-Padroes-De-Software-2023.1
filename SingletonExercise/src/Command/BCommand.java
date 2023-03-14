package Command;

public class BCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executou comando B");
    }
}
