import Ekstensja.*;

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

        

    }
}