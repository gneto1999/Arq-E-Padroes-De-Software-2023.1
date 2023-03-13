package model;

import model.command.Command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static final Map<String, Command> commandList = new HashMap<>();

    static {
        commandList.put("Incluir", null);
        commandList.put("Excluir", null);
        commandList.put("Alterar", null);
        commandList.put("Listar", null);
    }

    public static void addCommand(String key, Command command) {
        commandList.replace(key, command);
    }
    public static void invoker(String command) {
        commandList.get(command).execute();
    }
}
