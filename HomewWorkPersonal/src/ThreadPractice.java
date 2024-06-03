public class ThreadPractice implements Runnable{
    @Override
    public void run() {
        System.out.println("Started " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finished " + Thread.currentThread().getName());
    }
}
class ThreadMain{
    public static void main(String[] args) {
        Thread tp = new Thread(new ThreadPractice(),"thread1");
        tp.start();
    }
}
