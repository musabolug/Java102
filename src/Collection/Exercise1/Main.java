package Collection.Exercise1;

import java.util.TreeSet;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
    Book b1 = new Book("Fahrenheit 451",202,"Ray Bradbury",1953);
    Book b2 = new Book("The Lord OF The Rings",479,"J.R.R Tolkien",1954);
    Book b3 = new Book("Silmarillion",620,"J.R.R Tolkien",1977);
    Book b4 = new Book("Hobbit",304,"J.R.R Tolkien",1937);
    Book b5 = new Book("Chess",80,"Stefan Zweig",1942);

        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        book.add(b5);

        System.out.println("Sort by name");
        System.out.println();
        for (Book bookName :book){
            System.out.println("Book Name : "+bookName.getName()+
                    "\nNumber of page : " +bookName.getPageNumber()+
                    "\nAuthor Name : "+bookName.getAuthorName()+
                    "\nPublising Date : "+bookName.getPublishingDate());
            System.out.println("=======================");
        }

        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        System.out.println("***********************");
        System.out.print("Sort by page number");
        System.out.println();
        for (Book pageNumber : books){
            System.out.println("Book Name : "+pageNumber.getName()+
                    "\nNumber of page : " +pageNumber.getPageNumber()+
                    "\nAuthor Name : "+pageNumber.getAuthorName()+
                    "\nPublising Date : "+pageNumber.getPublishingDate());
            System.out.println("=======================");

        }






    }
}
