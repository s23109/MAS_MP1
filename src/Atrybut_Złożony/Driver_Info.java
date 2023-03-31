package Atrybut_Złożony;

public class Driver_Info {
    String name;
    int age;
    public Driver_Info(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Age:" + age;
    }
}
