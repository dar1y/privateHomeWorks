package homeWork6.work2;

import java.util.ArrayList;
import java.util.List;


class StoreServiceImpl implements StoreService{
    static List<Product> products = new ArrayList<>();

    @Override
    public void createNewProduct(Product product) {
        Product createdProduct;
        createdProduct=product;
        System.out.println(createdProduct + " has been created and added to product list");
        products.add(createdProduct);
    }

    @Override
    public void getAllProducts() {
        for(Product p: products){
            System.out.println(p);
        }
    }
}
