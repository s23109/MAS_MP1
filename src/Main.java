import Atrybut_Klasowy.*;
import Atrybut_Opcjonalny.*;
import Atrybut_Pochodny.*;
import Atrybut_Powtarzalny.*;
import Atrybut_Złożony.*;
import Ekstensja.*;
import Ekstensja_Trwała.*;
import Metoda_Klasowa.*;
import Przeciążenie.ShopItem;
import Przesłonięcie.*;

public class Main {
    public static void main(String[] args) {

        // Ekstensja
        if (false){
            System.out.println("Ekstensja");
            Students students = new Students();
            Student s1 = new Student("Adam Małysz" , "s22222");
            Student s2 = new Student("Mariusz Pudzianowski" , "s23131");
            Student s3 = new Student("Test Testowy" , "s1100");
            students.addStudent(s1);
            students.addStudent(s2);
            students.addStudent(s3);
            students.showStudents();

            students.removeStudent(s3);
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
            Car c1 = new Car("Mitsubishi", 6500);
            Car c2 = new Car("Ferrari", 125000);
            Car c3 = new Car("Subaru", 50000);
            cars.addCar(c1);
            cars.addCar(c2);
            cars.addCar(c3);
            cars.showCar();

            cars.dumpToFile();

            cars.readFromFile();
            cars.showCar();
        }

        //Atrybut złożony
        if (true){
            System.out.println("Atrybut złożony");
            Driver_Info shared = new Driver_Info("Adam" , 12);
            Driver_Info exclusive = new Driver_Info("Mariusz", 34);

            Truck g1 = new Truck("Scania", shared);
            Truck g2 = new Truck("Iveco", shared);
            Truck g3 = new Truck("Volvo", exclusive);

            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
            g3.printDriverAge();
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
            Przedmiot p1 = new Przedmiot("ABC",12);
            Przedmiot p2 = new Przedmiot("CCC",333);
            Przedmiot p3 = new Przedmiot("ASDASD",1);
            koszyk.addToKoszyk(p1);
            koszyk.addToKoszyk(p2);
            koszyk.addToKoszyk(p3);
            koszyk.seeKoszykDetails();

        }

        //Metoda Klasowa
        if (true){
            System.out.println("Metoda Klasowa");

            Book b1 = new Book("aaa",12);
            Book b2 = new Book("aaa",11);
            Book b3 = new Book("aaa",13);

            System.out.println("Total num of pages of all books: " + b1.getAllBooksTotalPageNo());

        }

        //Przesłonięcie
        if (false){
            System.out.println("Przesłonięcie");
            Pojazd pojazd = new Pojazd("a");
            Samochód samochód = new Samochód("b",2137);
            Samolot samolot = new Samolot("c");

            pojazd.getSth();
            samochód.getSth();
            samolot.getSth();

        }

        //Przeciążenie
        if (false){
            System.out.println("Przeciążenie");
            ShopItem shopItem = new ShopItem(100.0);
            System.out.println(shopItem.getPrice());
            System.out.println(shopItem.getPrice(0.25));
            System.out.println(shopItem.getPrice(0.25,0.25,0.25));
        }

    }
}