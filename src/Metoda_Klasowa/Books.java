package Metoda_Klasowa;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<Book> bookList;

    public Books() {
        this.bookList = new ArrayList<>();
    }

    public void addBook (Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
    }

    public double getAveragePageNo(){
        double pages = 0.0;
        int booksNo = 0;

        for (Book b: bookList) {
            pages+=b.getPageNum();
            booksNo+=1;
        }
        return pages/booksNo;
    }

}
