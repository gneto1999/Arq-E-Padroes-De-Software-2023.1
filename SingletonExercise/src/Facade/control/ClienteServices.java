package Facade.control;

import Facade.model.Cliente;
import Facade.model.FacadeSingleton;

import java.util.List;

public class ClienteServices {
    public List<Cliente> listarTodosClientes() {
        return FacadeSingleton.getInstance().listarTodosClientes();
    }
}
