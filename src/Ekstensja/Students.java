package Ekstensja;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> extent = new ArrayList<>();

    public void addStudent (Student student){
        extent.add(student);
    }

    public void removeStudent (Student student){
        extent.removeIf( s -> s.name== student.name && s.indexNo == student.indexNo );
    }

    public void showStudents (){
        System.out.println("Current Objects of " + Student.class.getName() + " :");
        if (extent.size() != 0) {
            for (Student student : extent) {
                System.out.println(student);
            }
        }
        else {
            System.out.println("No objects found");
        }
    }

    public void clearStudents(){
        extent.clear();
    }

}
