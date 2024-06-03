package homework2.store;

import java.util.*;

public class StoreMain {
    static List<Product> products = Arrays.asList(new Product("nothing",0,0));

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        createNewProduct();
        getProductByName("cherry");
        //deleteProductByName("cherry");
    }

    public static void createNewProduct() {
        System.out.println("Please enter the name of the product");
        String name = sc.nextLine();
        System.out.println("Please enter the price of the product");
        int price = sc.nextInt();
        System.out.println("Please enter the quantity of the product");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        if (products.stream().filter(p->p.getName().equals(name)).equals(name)) {
            for (int i = 0; i < products.size() + i++; ) {
                if (products.get(i).getName().equals(name)) {
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
        if (products.contains(product.getName().equals(name))) {
            for (int i = 0; i < products.size() + i++; ) {
                if (products.get(i).getName().equals(name)) {
                    products.remove(i);
                    System.out.println("product " + product.getName() + " had been deleted successfully");
                    break;
                }
            }
        } else {
            System.out.println("no such product " + name);
        }
    }
}

