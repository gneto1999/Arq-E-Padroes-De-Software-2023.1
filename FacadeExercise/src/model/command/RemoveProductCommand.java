package model.command;

import model.DataBase;
import model.Product;

public class RemoveProductCommand implements Command {
    private Integer id;

    public RemoveProductCommand(Integer id) {
        this.id = id;
    }

    @Override
    public void execute() {
        DataBase.removeProduct(id);
    }
}
