package model.command;

import model.DataBase;
import model.Product;

public class UpdateProductCommand implements Command {
    private Product product;
    private Integer id;

    public UpdateProductCommand(Integer id, Product product) {
        this.product = product;
        this.id = id;
    }

    @Override
    public void execute() {
        DataBase.updateProduct(id, product);
    }
}
