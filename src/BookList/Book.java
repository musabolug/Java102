package BookList;

public class Book {
    private String name;
    private String author;
    private int pageNumber;
    public Book(String name,String author , int pageNumber){
        this.name=name;
        this.pageNumber = pageNumber;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
