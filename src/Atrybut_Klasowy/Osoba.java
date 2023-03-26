package Atrybut_Klasowy;

import java.util.ArrayList;
import java.util.List;

public class Osoba {

    String imie ;
    int wiek;
    static String kraj = "PL";
    private static List<Osoba> extent = new ArrayList<>();

    private static void addOsoba (Osoba osoba){
        extent.add(osoba);
    }
    private static void  removeOsoba (Osoba osoba){
        extent.removeIf(o -> o.imie == osoba.imie && o.wiek == osoba.wiek);
    }

    public static void showExtend (){
        System.out.println("Ekstensja klasy " + Osoba.class.getName() );

        for (Osoba o: extent) {
            System.out.println(o);
        }

    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        addOsoba(this);
    }

    public void showDetails (){
        System.out.print("Imie : " + imie);
        System.out.print(" Wiek : " + wiek);
        System.out.println(" kraj : " + kraj );
    }

}

