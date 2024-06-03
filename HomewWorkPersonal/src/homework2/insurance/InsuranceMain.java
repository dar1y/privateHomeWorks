package homework2.insurance;

import java.util.ArrayList;
import java.util.List;

import static homework2.insurance.InsuranceMain.clientList;

public class InsuranceMain {
    public static List<Client> clientList = new ArrayList<>();
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();


        Thread t2 = new Thread(new MyThread1());
        t2.start();

    }

}
class MyThread extends Thread{
    @Override
    public synchronized void run() {
        Client client1 = new Client("Alexey", 18);
        Client client2 = new Client("Andrey", 27);
        Client client3 = new Client("Artyom", 30);
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        System.out.println("hello from myThread");



    }
}


class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("hello from myThread1");
        Client client4 = new Client("Alevtina", 35);
        Client client5 = new Client("Nikolay", 47);
        Client client6 = new Client("Domingo", 14);
        clientList.add(client4);
        clientList.add(client5);
        clientList.add(client6);
        for(Client cl: clientList){
            cl.buyInsurancePlan();
            System.out.println(cl);
        }
    }
}
