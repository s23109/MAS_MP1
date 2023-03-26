package Przesłonięcie;

import java.util.Date;

public class Samolot extends Pojazd{

    Date dateOfCreation;
    public Samolot(String nazwa) {
        super(nazwa);
        dateOfCreation = new Date();
    }

    @Override
    public void getSth() {
        System.out.println("Samolot :" + nazwa + " " + dateOfCreation);
    }
}
