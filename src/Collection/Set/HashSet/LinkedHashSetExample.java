package Collection.Set.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
       /* LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(20);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);

        Iterator<Integer> itr = linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
*/


        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Pazartesi");
        days.add("Sali");
        days.add("Carsamba");
        days.add("Persembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        days.remove("Pazar");

        for (String day : days) {
            System.out.println(day);
        }
    }
}
