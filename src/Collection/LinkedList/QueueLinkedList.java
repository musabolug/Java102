package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        //Polimorfizm yani çok biçimlilik
        Queue<String> q = new LinkedList<>();

        q.add("Musab");
        q.add("Bera");
        q.add("Mansur");
        q.add("OLUG");

       // System.out.println(q.remove("Mansur"));
        // listeden değer silmeye yarar;

        System.out.println(q.element());
        // Listenin  ilk elemanını verir

        System.out.println(q.poll());
        // listenin ilk elemanını verir ve kuyruktan siler

        System.out.println(q.peek());
        // Listenin  ilk elemanını verir


        Iterator itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
