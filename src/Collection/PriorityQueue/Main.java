package Collection.PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });// Su anda alfabetik bir siralama yapıyor ters sırtalamak istersen .reversed() ekle

        q.add("Musab");
        q.add("Bera");
        q.add("Mansur");
        q.add("OLUG");
/*
        for( String s : q){
            System.out.println(s);
        }*/

        Iterator<String> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
