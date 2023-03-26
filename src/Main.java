import Atrybut_Opcjonalny.Plane;
import Atrybut_Złożony.Atr_zł;
import Atrybut_Złożony.Główna;
import Ekstensja.*;
import Ekstensja_Trwała.*;

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
        if (true){
            System.out.println("Atrybut opcjonalny");
            Plane p1 = new Plane("AAA", "BBB");
            Plane p2 = new Plane("CCC");

            System.out.println(p1);
            System.out.println(p2);

        }
    }
}