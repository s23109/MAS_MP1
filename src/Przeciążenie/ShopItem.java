package Przeciążenie;

public class ShopItem {
    double price;

    public ShopItem(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double getPrice(double discount){
        return (1.0-discount)*price;
    }
    public double getPrice(double... discounts){
        System.out.println("Universal");
        double discount = 1.0;

        for (double d: discounts
             ) {
            discount*=(1-d);
        }
        return price*discount;
    }


}
