package Drinks;

public abstract class Drink {
    private double price = 0.0;
    private boolean isProcured = false;
    private boolean isOrdered = false;

    public Drink(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
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
