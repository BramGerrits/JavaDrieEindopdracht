public abstract class Drink implements Orderable, Purchaseable{
    private double price = 0.0;
    private boolean isProcured = false;
    private boolean isOrdered = false;

    public Drink(double price){
        this.price = price;
    }

    /**
     * Gets the price in euro's.
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     * Gets the sound the drink makes when it is drank.
     * @return drinking sound of the drink
     */
    abstract String getDrinkSound();
}
