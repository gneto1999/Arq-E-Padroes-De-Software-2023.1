package Command;

import java.util.HashMap;
import java.util.Map;

public class InvokerSingleton {
    private static InvokerSingleton instance;
    public static Map<String, Command> comandos = new HashMap();

    private InvokerSingleton() {
    }

    public static InvokerSingleton getInstance() {
        if(instance == null) {
            instance = new InvokerSingleton();
        }

        return instance;
    }

    static {
        comandos.put("A", new ACommand());
        comandos.put("B", new BCommand());
    }

    public void invoke(String command) {
        comandos.get(command).execute();
    }
}
