package Collection.ArrayList;
import javax.swing.*;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(14);
        list.add(20);
        list.add(null);

        list.add(2,50);
        // eger 2. indexte bir deger varken baska bir sayı eklemek isterseniz eklemek
        // istediğiniz sayıyı 2. indexe ekleer ve önceden 2. indexte bulunan degeri 3. indexe kaydırır


        list.set(3,40);
        //3. indexte var olan sayıyı siler ve yerine istediğiniz sayıyı yazar

        //System.out.println(list.lastIndexOf(20));
       // System.out.println(list);
        Iterator<Integer> itr = list.iterator();

      /*  while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
        for(Integer element : list){
          //  System.out.println(element);
        }

        List<String> cityList = new ArrayList<>();
        cityList.add("Istanbul");
        cityList.add("Ankara");
        cityList.add("Karabuk");
        cityList.add("Isparta");

        List<String> cityList2 = new ArrayList<>();
        cityList2.add("Mugla");
        cityList2.add("Adiyaman");
        cityList2.add("Bolu");
        cityList2.addAll(cityList);

        //        cityList2.clear();
        //        Listedeki her elemani temizler siler

        Object[] objectArr = cityList2.toArray();
        String[] str = cityList2.toArray(new String[0]);
        System.out.println(str[3]);




    }


}
