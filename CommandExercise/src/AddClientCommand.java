public class AddClientCommand implements Command {
    private Client client;

    public AddClientCommand(Client client) {
        this.client = client;
    }

    @Override
    public void execute() {
        client.addClient(client);
    }
}
