package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(12);
        list.add(8);
        list.add(10);
        list.add(9);
        list.add(35);
        list.add(35);
        list.add(53);

       // list.forEach(i -> System.out.println(i));
      //  list.stream().filter(num -> num >25).forEach(i -> System.out.println(i)); // filtreleme aralık belirleme
      //  list.stream().distinct().forEach(i -> System.out.println(i)); // tekrar eden değerleri 1 kere yazdırır
        //list.stream().sorted().distinct().forEach(i -> System.out.println(i)); // kücükten buyuge dogru sıralar
       // list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(i -> System.out.println(i));
        // siralamayi terse cevirir
      //  list.stream().limit(5L).forEach(i -> System.out.println(i)); // ilk 5 elemanı verir

        //  list.stream().skip(3L).limit(5L).sorted().distinct().forEach(i -> System.out.println(i));
        // ilk 3 elemanı atlar sonraki tekrar edenler hariç sayıları küçükten büyüğe sıralar

      //  long c = list.stream().skip(4).distinct().count();
        // count() kaç tane eleman olduğunu verir ama sonrasında işlem yapılamaz
      //  System.out.println(c);

       // boolean control = list.stream().anyMatch(i -> i==9);
        // anyMatch() istenilen sayının olup olmadığını belirtir sonrasında işlem yapılamaz
       // System.out.println(control);

       // boolean control = list.stream().noneMatch(i -> i<0);
        // bu ornekte olduğu şekli ile listede 0 dan küçük herhangi bir değer olup olmadığı konusunda
        // boolean bir değer verir eğer 0 dan küçük bir değer yoksa true varsa false döner
        //System.out.println(control);

       // list.stream().map(i -> i *2 ).distinct().forEach(i -> System.out.println(i));
        // listedeki tüm değerleri iki ile çarpar ve yazdırır
        list.stream().map(i -> Math.sqrt(i)).distinct().forEach(i -> System.out.println(i));
        // bütün degerlerin karekökünü alır


    }
}
