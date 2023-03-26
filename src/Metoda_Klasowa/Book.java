package Metoda_Klasowa;

public class Book {

    String name;
    int pageNum;

    public Book(String name, int pageNum) {
        this.name = name;
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }
}
