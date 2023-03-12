import java.util.ArrayList;
import java.util.List;

public class Client {
    private Integer id;
    private String name;
    private static final List<Client> clientList = new ArrayList<>();

    public Client() {
    }

    public Client(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void removeClient(int id) {
        int index = 0;
        for (Client client : clientList) {
            if(client.id == id) {
                index = clientList.indexOf(client);
                break;
            }
        }
        clientList.remove(index);
    }

    public void updateClient(int id, int newId, String newName) {
        for (Client client : clientList) {
            if(client.id == id) {
                client.id = newId;
                client.name = newName;
            }
        }
    }

    public void clients() {
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    @Override
    public String toString() {
        return id + " -- " + name;
    }
}
