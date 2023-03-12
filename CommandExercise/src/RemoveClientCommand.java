public class RemoveClientCommand implements Command {
    private Client client;
    private Integer id;

    public RemoveClientCommand(Client client, Integer id) {
        this.client = client;
        this.id = id;
    }

    @Override
    public void execute() {
        client.removeClient(id);
    }
}
