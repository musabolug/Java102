package Collection.Set.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();

        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(50);
        hashSet.add(null);

       // hashSet.remove(10);

        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
