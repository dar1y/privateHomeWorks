package homeWork4.second;

class MyThread extends Thread{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(),"thread1");
        Thread thread2 = new Thread(new MyThread(),"thread2");

    }
}
