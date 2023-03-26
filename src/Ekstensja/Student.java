package Ekstensja;

public class Student {
    String name;
    String indexNo;

    public Student(String name, String indexNo) {
        this.name = name;
        this.indexNo = indexNo;
    }

    @Override
    public String toString() {
        return indexNo + " - " + name;
    }
}
