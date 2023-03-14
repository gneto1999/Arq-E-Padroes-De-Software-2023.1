package Command;

public class ACommand implements Command {

    @Override
    public void execute() {
        System.out.println("Executou comando A");
    }
}
