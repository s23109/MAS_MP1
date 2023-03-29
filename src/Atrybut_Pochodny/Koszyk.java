package Atrybut_Pochodny;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    //atr wyliczalny

    List<Przedmiot> przedmiotList;

    public Koszyk() {

        przedmiotList=new ArrayList<>();
    }

    public void addToKoszyk (Przedmiot przedmiot){
        przedmiotList.add(przedmiot);
    }

    public void removeFromKoszyk (Przedmiot przedmiot){
        przedmiotList.remove(przedmiot);
    }

    //Atrybut Pochodny
    public int calculateTotal (){
        int total = 0;

        for (Przedmiot p: przedmiotList) {
            total+=p.cena;
        }

        return total;
    }

    public void seeKoszykDetails(){
        System.out.println("Koszyk Total: " + calculateTotal());
        System.out.println("Koszyk items: ");
        if (przedmiotList.size()==0){
            System.out.println("Empty");
        }else {
            for (Przedmiot p: przedmiotList) {
                System.out.println(p.nazwa + " Cena:" + p.cena);
            }
        }
    }

}
