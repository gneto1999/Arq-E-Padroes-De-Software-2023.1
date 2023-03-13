package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Product> productList = new ArrayList<>();

    public static void removeProduct(int id) {
        int index = 0;
        for (Product product : productList) {
            if(product.getId() == id) {
                index = productList.indexOf(product);
            }
        }
        productList.remove(index);
    }

    public static void updateProduct(int id, Product prod) {
        for (Product product : productList) {
            if(product.getId() == id) {
                productList.set(productList.indexOf(product), prod);
            }
        }
    }

    public static List products() {
        return productList;
    }
}
