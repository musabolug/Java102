package MultiThreadsAndConcurrency.ThreadsRace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Threadwork tw = new Threadwork();
        ExecutorService es = Executors.newFixedThreadPool(4);

        for (int i= 1; i<=10000;i++){
            es.execute(tw);
        }
        es.shutdown();

        try {
            es.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Odd Numbers :"+tw.getOddNumber().size());


    }
}
