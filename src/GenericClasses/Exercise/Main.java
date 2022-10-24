package GenericClasses.Exercise;

public class Main {
    public static void main(String[] args) {
      /*  MyList<Integer> list  = new MyList<>();
        System.out.println("Dizideki eleman sayisi :" +list.size());
        System.out.println("Dizi kapasitesi" + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki eleman sayisi : " +list.size());
        System.out.println("Dizi kapasitesi : " +list.getCapacity());

*/
      /*  MyList<Integer> list  = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("2. indexdeki deger : " +list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0,100);
        System.out.println("2. indexdeki deger :"+ list.get(2));
        System.out.println("list : " +list.toString() );
            */

        MyList<Integer> list = new MyList<>();
        System.out.println("Liste durumu : "+(list.isEmpty() ?"Bos": "Dolu"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(20);

        System.out.println("Liste durumu : "+(list.isEmpty() ?"Bos": "Dolu"));
        // Bıldugu ilk indexi verir
        System.out.println("index : "+list.indexOf(20));

        //Bulmazsa -1 dondurur
        System.out.println("Index : "+ list.indexOf(100));

        // Buldugu son indexi verir
        System.out.println("Index : "+ list.lastIndexOf(20));

        //Listeyi  Object[] dizisi  olarak geri verir
        Object[] dizi = list.toArray();
        System.out.println("Object dizisinin ilk elemani : "+dizi[0]);

        // Liste veri turunde bir altliste olusturuldu
        MyList<Integer> subList = list.subList(0,3);
        System.out.println("Sub list : "+subList.toString());

        // Degerin listede olup olmadıgını sorgular
        System.out.println("Listede 20 degeri : "+ list.contains(20));
        System.out.println("Listede 120 degeri :"+list.contains(120));

        // Listeyi tamamen bosaltır ve varsayılan degere cevirir
        list.clear();
        System.out.println(list.toString());
        System.out.println(list.getCapacity());
        System.out.println(list.size());

    }
}
