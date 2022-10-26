package Collection.LinkedList;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Musab");
        list.add("Bera");
        list.add("Mansur");
        list.add("OLUG");

    //    System.out.println("Element of 2 index: " + list.get(2));
        // get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.

        // Liste başına eleman ekler
        ((LinkedList<String>) list).addFirst("Ali");

        // Liste sonuna eleman ekler
        ((LinkedList<String>)list).addLast("Umit");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
