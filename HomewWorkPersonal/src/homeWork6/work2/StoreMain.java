package homeWork6.work2;

import java.util.ArrayList;
import java.util.List;

public class StoreMain {

    public static void main(String[] args) {
        StoreServiceImpl ssi = new StoreServiceImpl();
        ssi.createNewProduct(new Clothing(16,50));
        ssi.createNewProduct(new Electronics(2,300));
        ssi.getAllProducts();
    }
}
