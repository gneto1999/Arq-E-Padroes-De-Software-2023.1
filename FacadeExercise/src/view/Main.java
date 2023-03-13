package view;

import model.ProductService;
import model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Comando: ");
            String str = sc.nextLine();
            String [] arrStr = str.split(" ");
            System.out.println(Arrays.toString(arrStr));
            switch (arrStr.length) {
                case 6:
                    ProductService.updateProduct(Integer.parseInt(arrStr[2]), new Product(Integer.parseInt(arrStr[3]), Integer.parseInt(arrStr[5]), arrStr[4]));
                    break;
                case 5:
                    ProductService.addProduct(new Product(Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[4]), arrStr[3]));
                    break;
                case 3:
                    ProductService.removeProduct(Integer.parseInt(arrStr[2]));
                    break;
                case 2:
                    List<Product> products = ProductService.products();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 1:
                    return;
                default:
                    System.out.println("Comando incorreto!!!");
            }
        }
    }
}