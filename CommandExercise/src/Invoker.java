import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static final Map<String, Command> commandMap = new HashMap<>();

    static {
        commandMap.put("Incluir", null);
        commandMap.put("Excluir", null);
        commandMap.put("Alterar", null);
        commandMap.put("Listar", null);
    }

    public void addCommand(String key, Command command) {
        commandMap.replace(key, command);
    }
    public void invoker(String command) {
        commandMap.get(command).execute();
    }
}