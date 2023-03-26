package Atrybut_Złożony;

public class Atr_zł {
    String add_data;
    int some_num;
    public Atr_zł(String add_data, int some_num) {
        this.add_data = add_data;
        this.some_num = some_num;
    }

    @Override
    public String toString() {
        return add_data + " : " + some_num;
    }
}
