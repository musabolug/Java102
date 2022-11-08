package MultiThreadsAndConcurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //THREAD SINIFINI KALITARAK
     /*   Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.start();
        c2.start();*/


        //RUNNABLE INTERFACE KULLANARAK
      /*  Counter2 counter1 = new Counter2("Counter1");
        Counter2 counter2 = new Counter2("Counter2");
        Counter2 counter3 = new Counter2("Counter3");

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter2);
        Thread t3 = new Thread(counter3);

        t1.start();
        t2.start();
        t3.start();*/


        //THREAD DURDURMAK VE BEKLETMEK

        Counter3 c1 = new Counter3("c1",1);
        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(2000);
        c1.stop();



    }
}
