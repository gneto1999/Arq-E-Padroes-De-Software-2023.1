package model;

import model.command.AddProductCommand;
import model.command.ProductsCommand;
import model.command.RemoveProductCommand;
import model.command.UpdateProductCommand;

import java.util.List;

public class ProductService {

    public static void addProduct(Product product) {
        Invoker.addCommand("Incluir", new AddProductCommand(product));
        Invoker.invoker("Incluir");
    }

    public static void removeProduct(int id) {
        Invoker.addCommand("Excluir", new RemoveProductCommand(id));
        Invoker.invoker("Excluir");
    }

    public static void updateProduct(int id, Product product) {
        Invoker.addCommand("Alterar", new UpdateProductCommand(id, product));
        Invoker.invoker("Alterar");
    }

    public static List products() {
        ProductsCommand productsCommand = new ProductsCommand();
        Invoker.addCommand("Listar", productsCommand);
        Invoker.invoker("Listar");
        return productsCommand.getProducts();
    }
}
