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
        System.out.println("Balance before withdrawal " + money);
        money -= amount;
        System.out.println("Balance after withdrawal " + money);
    }

    public BankAccount(int money) {
        this.money = money;
    }
}

