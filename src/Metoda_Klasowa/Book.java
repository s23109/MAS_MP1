package Metoda_Klasowa;

import java.util.ArrayList;
import java.util.List;

public class Book {

    String name;
    int pageNum;

    static List<Book> extent= new ArrayList<>();

    public Book(String name, int pageNum) {
        this.name = name;
        this.pageNum = pageNum;
        addBook(this);
    }

    private void addBook(Book book){
        extent.add(book);
    }

    private void removeBook(Book book){
        extent.remove(book);
    }

    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public static int getAllBooksTotalPageNo() {
        int total = 0;
        for (Book book : extent
        ) {
            total += book.pageNum;
        }
        return total;
    }


}
