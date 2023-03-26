package Ekstensja_Trwała;

import Ekstensja.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> extent = new ArrayList<>();
    String extendFile ;

    public Cars(String extendFile) {
        this.extendFile = extendFile;
    }

    public void addCar (Car car) {
        extent.add(car);
    }

    public void removeCar (Car car){
        extent.removeIf( c -> c.name == car.name && c.price == car.price);
    }

    public void showCar (){
        System.out.println("Current Objects of " + Car.class.getName() + " :");

        if (extent.size() != 0) {
            for (Car c: extent) {
                System.out.println(c + " MEM: " + Integer.toHexString(System.identityHashCode(c)));
            }
        }

    }

    public void dumpToFile(){
        DataOutputStream out =null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(extendFile)));
            out.writeInt(extent.size());
            for (Car c: extent) {
                c.write(out);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void readFromFile (){
        DataInputStream in = null;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(extendFile)));

            int objCount = in.readInt();

            for (int i = 0 ; i < objCount ; i++){
               Car a = new Car();
               a.read(in);
               addCar(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
