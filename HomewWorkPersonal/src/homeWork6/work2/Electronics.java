package homeWork6.work2;

public class Electronics extends Product{
    private int warranty;
    private int price;

    public Electronics() {
    }

    public Electronics(int warranty, int price) {
        this.warranty = warranty;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warranty=" + warranty +
                ", price=" + price +
                '}';
    }
}
