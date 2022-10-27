package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();

        country.put("TR", "Turkiye"); // listeye eleman ekleme
        country.put("GER", "Germani");
     //x"   country.put("TR", "TurkiyeYeni");// set metodu olmadigi için en son tanımlanan deger gecerli olur
        country.put("ENG", "England");

       // System.out.println(country.size());
       // System.out.println(country.get("ENG"));


        for(String countryKey : country.keySet()){
            System.out.println(countryKey);
        }
        System.out.println("########");
        for (String countryName : country.values()){
            System.out.println(countryName);
        }
        for (String i : country.keySet()) {
            System.out.println("key: " + i + " value: " + country.get(i));
        }

    }
}
