package homeWork4.second;
public class BankAccount {

    private int money;

    synchronized void deposit(int amount) throws InterruptedException {
        Thread.sleep(1000);
        money += amount;
        notifyAll();
        System.out.println("Balance is increased " + money);
    }

    synchronized void withdraw(int amount) throws InterruptedException {
        while (amount > money) {
        }

        System.out.println("Balance before withdrawal " + money);
        money -= amount;
        System.out.println("Balance after withdrawal " + money);
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

