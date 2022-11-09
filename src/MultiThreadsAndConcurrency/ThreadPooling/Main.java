package MultiThreadsAndConcurrency.ThreadPooling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            OrderMatic orderMatic = new OrderMatic();
        List<Thread>  threads = new ArrayList<>();


        ExecutorService pool = Executors.newFixedThreadPool(50);


        for (int i = 0; i<100;i++){
         pool.execute(orderMatic);
        }
      //  pool.shutdown(); // Bitmediği için otomatik kapama

        // Uygulamamız çalışırken belli miktarda bir Thread ile sınırlandırmak isteyebiliriz.
        //Bu nedenle Thread havuzu oluşturup bu havuzu önceden oluşturulmuş ve kullanıma hazır
        // Thread nesneleri ile doldururuz. Böylece, performans kazanımı ve sistem kaynaklarının
        // verimli kullanımını sağlayabiliriz.

    }
}
