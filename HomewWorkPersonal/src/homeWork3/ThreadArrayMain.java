package homeWork3;

import java.util.Arrays;
import java.util.List;

import static homeWork3.ThreadArrayMain.list;

public class ThreadArrayMain {

    static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(thread1);
        t1.start();
        Thread t2 = new Thread(thread1);
        t2.start();
    }
}

class Thread1 extends Thread {
    int i;
    @Override
    public void run() {
        incrementEl(3);
        printEl();
        }

    private void incrementEl(int el) {
        list.set(i,list.get(i)+el);
        System.out.println(list.get(i));
    }

    private void printEl() {
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

