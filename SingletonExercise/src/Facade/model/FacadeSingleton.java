package Facade.model;

import java.util.List;

public class FacadeSingleton {
    private static FacadeSingleton instance;

    private FacadeSingleton() {
    }

    public static FacadeSingleton getInstance() {
        if(instance == null) {
            instance = new FacadeSingleton();
        }

        return instance;
    }

    public List<Cliente> listarTodosClientes() {
        return DataBase.clientes;
    }
}
