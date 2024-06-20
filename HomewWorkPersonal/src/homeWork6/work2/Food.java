package homeWork6.work2;

public class Food extends Product{
    private int price;
    private int expireDate;

    public Food() {
    }

    public Food(int price, int expireDate) {
        this.price = price;
        this.expireDate = expireDate;
    }

    @Override
    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", expireDate=" + expireDate +
                '}';
    }
}
