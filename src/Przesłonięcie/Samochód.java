package Przesłonięcie;

public class Samochód extends Pojazd{
    int cena;
    public Samochód(String nazwa, int cena) {
        super(nazwa);
        this.cena = cena;
    }

    @Override
    public void getSth() {
        System.out.println("Samochód :" + nazwa + " " + cena);
    }
}
