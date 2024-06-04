public class Lesson4Multithreading {
    public static void main(String[] args)  {
        Thread tp3 = new Thread(new MyThread1(),"thread3");
        Thread tp1 = new Thread(new MyThread1(),"thread1");
        Thread tp2 = new Thread(new MyThread1(),"thread2");
        tp1.start();
        tp2.start();
        tp3.start();
        try {

            tp1.join();
            System.out.println("thread1 is waiting for finish");

            tp2.join();
            System.out.println("thread2 is waiting for finish");

            tp3.join();
            System.out.println("thread3 is waiting for finish");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("threads are finished");
    }
}

class MyThread1 extends Thread{
@Override
public void run() {
    System.out.println("the thread is created and goes to sleep" );
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
