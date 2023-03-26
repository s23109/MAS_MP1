package Atrybut_Złożony;

public class Główna {

    String main_data;
    Atr_zł atrZł;

    public Główna(String main_data, Atr_zł atrZł) {
        this.main_data = main_data;
        this.atrZł = atrZł;
    }

    @Override
    public String toString() {
        return "Main Data " + main_data +"\nAtrzŁ : " + atrZł;
    }
}
