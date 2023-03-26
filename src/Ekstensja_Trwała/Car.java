package Ekstensja_Trwała;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Car {

    String name;
    float price;

    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
    }


    @Override
    public String toString() {
        return name + " - " + price;
    }

    public void write (DataOutputStream stream) throws IOException {
        stream.writeUTF(name);
        stream.writeFloat(price);
    }


    public void read (DataInputStream stream) throws IOException {
        name = stream.readUTF();
        price = stream.readFloat();
    }

}
