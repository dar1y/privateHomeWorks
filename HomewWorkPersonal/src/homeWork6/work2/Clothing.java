package homeWork6.work2;

public class Clothing extends Product{
    private int size;
    private int price;

    public Clothing() {
    }

    public Clothing(int size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", price=" + price +
                '}';
    }
}
