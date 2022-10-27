package Collection.Exercise1;

public class Book {
    private String name;
    private int pageNumber;
    private String authorName;
    private String publishingDate;

    public Book(String name, int pageNumber, String authorName, String publishingDate){
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishingDate = publishingDate;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        this.pageNumber= pageNumber;
    }

}
