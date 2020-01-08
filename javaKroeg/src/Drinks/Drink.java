package Drinks;

abstract class Drink {
    private int priceInCoins = 0; //Prijs in munten.
    private double price = 0.0;
    private boolean isProcured = false;
    private boolean isOrdered = false;

    public double getPrice(){
        return price;
    }

    public double getPriceInCoins(){
        return priceInCoins;
    }

//    public void sellTo(Visitor visitor){
//
//    }
//
//    public void getOrderedBy(Pub pub){
//
//    }
}
