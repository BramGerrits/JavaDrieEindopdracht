package Drinks;

public abstract class Drink {
    private int priceInCoins = 0; //Prijs in munten.
    private double price = 0.0;
    private boolean isProcured = false;
    private boolean isOrdered = false;

    public Drink(int priceInCoins, double price){
        this.priceInCoins = priceInCoins;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double getPriceInCoins(){
        return priceInCoins;
    }

    abstract String getDrinkSound();

// Deze methodes vereisen objecten buiten de Drinks package en kunnen dus niet gebruikt worden.
//    public void sellTo(Visitor visitor){
//
//    }
//
//    public void getOrderedBy(Pub pub){
//
//    }
}
