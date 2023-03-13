package model.command;

import model.DataBase;

import java.util.List;

public class ProductsCommand implements Command {
    private List list;

    @Override
    public void execute() {
        list = DataBase.products();
    }

    public List getProducts() {
        return list;
    }
}
