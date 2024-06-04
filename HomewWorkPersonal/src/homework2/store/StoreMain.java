package homework2.store;

import java.util.*;

public class StoreMain {
    static List<Product> products = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        createNewProduct();
        getProductByName("cherry");
        deleteProductByName("cherry");
    }

    public static void createNewProduct() {
        System.out.println("Please enter the name of the product");
        String name = sc.nextLine();
        System.out.println("Please enter the price of the product");
        int price = sc.nextInt();
        System.out.println("Please enter the quantity of the product");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        if (!products.isEmpty()) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().equalsIgnoreCase(name)) {
                    int combinedQuantity = product.getQuantity() + quantity;
                    product.setQuantity(combinedQuantity);
                    break;
                }
            }
        } else {
            products.add(product);
        }
    }

    public static void getProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                System.out.println(p);
            } else {
                System.out.println("there is no such product");
            }
        }
    }

    public static void deleteProductByName(String name) {
        if (!products.isEmpty()) {
            for (int i = 0; i < products.size();i++) {
                if (products.get(i).getName().equalsIgnoreCase(name)) {
                    System.out.println("product " + products.get(i).getName() + " had been deleted successfully");
                    products.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("no such product " + name);
        }
    }
}

