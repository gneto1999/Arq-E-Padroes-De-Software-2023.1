public class UpdateClientCommand implements Command {
    private Client client;
    private Integer id;
    private Integer newId;
    private String newName;

    public UpdateClientCommand(Client client, Integer id, Integer newId, String newName) {
        this.client = client;
        this.id = id;
        this.newId = newId;
        this.newName = newName;
    }

    @Override
    public void execute() {
        client.updateClient(id, newId, newName);
    }
}
