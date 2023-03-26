import Atrybut_Klasowy.*;
import Atrybut_Opcjonalny.*;
import Atrybut_Pochodny.*;
import Atrybut_Powtarzalny.*;
import Atrybut_Złożony.*;
import Ekstensja.*;
import Ekstensja_Trwała.*;
import Metoda_Klasowa.*;
public class Main {
    public static void main(String[] args) {

        // Ekstensja
        if (false){
            System.out.println("Ekstensja");
            Students students = new Students();
            students.addStudent(new Student("Adam Małysz" , "s22222"));
            students.addStudent(new Student("Mariusz Pudzianowski" , "s23131"));
            students.addStudent(new Student("Test Testowy" , "s1100"));
            students.showStudents();

            students.removeStudent(new Student("Test Testowy" , "s1100"));
            students.showStudents();

            students.clearStudents();
            students.showStudents();
        }

        //Ekstensja - trwałość
        if (false) {
            System.out.println("Ekstensja - trwałość");
            String path_to_file = System.getProperty("user.dir") + "\\src\\Ekstensja_Trwała\\extent.bin";
            System.out.println("file loc = " + path_to_file);
            Cars cars = new Cars(path_to_file);
            cars.addCar(new Car("Mitsubishi", 6500));
            cars.addCar(new Car("Ferrari", 125000));
            cars.addCar(new Car("Subaru", 50000));
            cars.showCar();

            cars.dumpToFile();

            cars.readFromFile();
            cars.showCar();
        }

        //Atrybut złożony
        if (false){
            System.out.println("Atrybut złożony");
            Atr_zł shared = new Atr_zł("shared" , 12);
            Atr_zł exclusive = new Atr_zł("exclusive", 34);

            Główna g1 = new Główna("AAA", shared);
            Główna g2 = new Główna("BBB", shared);
            Główna g3 = new Główna("CCC", exclusive);

            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);

        }

        //Atrybut opcjonalny
        if (false){
            System.out.println("Atrybut opcjonalny");
            Plane p1 = new Plane("AAA", "BBB");
            Plane p2 = new Plane("CCC");

            System.out.println(p1);
            System.out.println(p2);

        }

        //Atrybut Powtarzalny
        if (false){
            System.out.println("Atrybut Powtarzalny");
            Teacher teacher = new Teacher("AAA",123);
            teacher.addClass("class1", "class2", "class3");
            teacher.showDetails();
            teacher.clearClass();
            teacher.showDetails();

        }

        //Atrybut klasowy
        if (false){
            System.out.println("Atrybut klasowy");
            Osoba o1 = new Osoba("AAA",123);
            Osoba o2 = new Osoba("BBB",221);
            o1.showExtend();

            o1.showDetails();
            o2.showDetails();

        }

        //Atrybut pochodny
        if (false){
            System.out.println("Atrybut pochodny");
            Koszyk koszyk = new Koszyk();
            koszyk.addToKoszyk(new Przedmiot("ABC",12));
            koszyk.addToKoszyk(new Przedmiot("CCC",333));
            koszyk.addToKoszyk(new Przedmiot("ASDASD",1));
            koszyk.seeKoszykDetails();

        }

        //Metoda Klasowa
        if (true){
            System.out.println("Metoda Klasowa");
            Books books = new Books();
            books.addBook(new Book("aaa",12));
            books.addBook(new Book("aaa",11));
            books.addBook(new Book("aaa",13));
            System.out.println("Average num of pages: " + books.getAveragePageNo());

        }

        // System.out.println("");
    }
}