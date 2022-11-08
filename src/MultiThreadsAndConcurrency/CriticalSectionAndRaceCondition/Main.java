package MultiThreadsAndConcurrency.CriticalSectionAndRaceCondition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
      /*  Thread t1 = new Thread(orderMatic);
        t1.start();
        t1.join();

        Thread t2 = new Thread(orderMatic);
        t2.start();
        t2.join();*/

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i<100; i++){
            Thread t = new Thread(orderMatic);
            threads.add(t);
            t.start();
        }
        for (Thread t : threads){
            t.join();
        }
    }
}
