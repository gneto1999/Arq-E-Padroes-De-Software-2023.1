package control;

import model.Facade;
import model.Product;

import java.util.List;

public class ProductService {
    public static List<Product> products() {
        return Facade.products();
    }

    public static void addProduct(Product product) {
        Facade.addProduct(product);
    }

    public static void removeProduct(int id) {
        Facade.removeProduct(id);
    }

    public static void updateProduct(int id, Product product) {
        Facade.updateProduct(id, product);
    }
}
