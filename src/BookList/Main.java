package BookList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Silmarillion","JRR Tolkien",620));
        bookList.add(new Book("The Lord of The Rings","JRR Tolkien",900));
        bookList.add(new Book("The Hobbit","JRR Tolkien",350));
        bookList.add(new Book("Fahrenheit 451","Ray BradBury",202));
        bookList.add(new Book("Chess","Stephan Zweig",85));
        bookList.add(new Book("Kizil Veba","JAck Londpon",55));
        bookList.add(new Book("Yabanci","Albert Camus",120));
        bookList.add(new Book("Kamelyali Kadin","Alexandre Dumas Fils",234));
        bookList.add(new Book("Ne Icin Varsan Onun Icin yasa","Hikmet Anişl Oztekin",250));
        bookList.add(new Book("Animal Farm","George Orwell",121));
        bookList.add(new Book("1984","George Orwell",288));

        System.out.println("----------------------------");
        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(),book.getAuthor()));
        for (String i : bookMap.keySet()){
            System.out.println("-Book Name :" +i+ " - "+"Author :"+bookMap.get(i));
        }
        System.out.println("----------------------------");
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber()>100).collect(Collectors.toList());
        listBook.stream().forEach(book -> System.out.println("- Book Name :"+ book.getName()+ " - "+"Author :"+book.getAuthor()+
                " - "+ "Page Number :"+ book.getPageNumber()));
        System.out.println("----------------------------");

        long count = bookList.stream().count();
        System.out.println("Number of Books :"+ count);
        }
}
