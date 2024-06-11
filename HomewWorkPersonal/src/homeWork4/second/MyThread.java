package homeWork4.second;

import static homeWork4.second.MyThread.ba;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            ba.deposit(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static BankAccount ba = new BankAccount(3000);

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread(), "thread1");
        Thread thread2 = new Thread(new MyThread1(), "thread2");
        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        try {
            ba.withdraw(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
