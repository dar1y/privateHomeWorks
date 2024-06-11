package homeWork3;

class ThreadCounter1 implements Runnable{
        int x= 0;
    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            int temp = x;
            temp++;
            x=temp;
        }
    }

    public int getX(){
        return x;
    }
}

public class ThreadMain1{
    public static void main(String[] args) {
        ThreadCounter1 threadCounter1 =  new ThreadCounter1();
        Thread tc1  = new Thread(threadCounter1);
        tc1.start();
        Thread tc2  = new Thread(threadCounter1);
        tc2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadCounter1.getX());

    }
}
