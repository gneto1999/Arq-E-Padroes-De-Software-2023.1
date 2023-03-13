package control;

import model.Product;

import java.util.List;

public class ProductService {
    public static List<Product> products() {
        return model.ProductService.products();
    }

    public static void addProduct(Product product) {
        model.ProductService.addProduct(product);
    }

    public static void removeProduct(int id) {
        model.ProductService.removeProduct(id);
    }

    public static void updateProduct(int id, Product product) {
        model.ProductService.updateProduct(id, product);
    }
}
