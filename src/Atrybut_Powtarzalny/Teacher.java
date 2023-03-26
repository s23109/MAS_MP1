package Atrybut_Powtarzalny;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    String name;
    int pay;

    List<String> classes;

    public Teacher(String name, int pay) {
        this.name = name;
        this.pay = pay;
        this.classes = new ArrayList<>();
    }

    public void addClass (String... newClasses) {
        for (String newClass : newClasses){
            classes.add(newClass);
        }
    }

    public void removeClass (String newClass){
        classes.remove(newClass);
    }

    public void clearClass (){
        classes.clear();
    }

    public void showDetails () {
        System.out.println("Name :" + name);
        System.out.println("Pay :" + pay);

        System.out.println("Classes :" );

        if (classes.size()==0){
            System.out.print("none");
        }else {
            for (String s: classes) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }

    }

}
