public class AllClientsCommand implements Command {
    private Client client;

    public AllClientsCommand(Client client) {
        this.client = client;
    }

    @Override
    public void execute() {
        client.clients();
    }
}
