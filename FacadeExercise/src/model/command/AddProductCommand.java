package model.command;

import model.DataBase;
import model.Product;

public class AddProductCommand implements Command {
    private Product product;

    public AddProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        DataBase.productList.add(product);
    }
}
