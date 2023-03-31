package Atrybut_Złożony;

public class Truck {

    String truck_Name;
    Driver_Info atrZł;

    public Truck(String truck_Name, Driver_Info atrZł) {
        this.truck_Name = truck_Name;
        this.atrZł = atrZł;
    }

    public void printDriverAge(){
        System.out.println("Age of Driver " + atrZł.age);
    }

    @Override
    public String toString() {
        return "Truck Name:" + truck_Name +"\nDriver Info : " + atrZł;
    }
}
