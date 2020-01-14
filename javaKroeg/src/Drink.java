public abstract class Drink implements Purchaseable {
    private double price = 0.0;
    private boolean isOrdered = false;

    /**
     * The constructor of the Drink class.
     * Sets the price of the drink.
     * @param price The price of the drink
     */
    public Drink(double price){
        this.price = price;
    }

    /**
     * Gets the price of the drink.
     * @return The price of the drink
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sells the drink from the pub to the visitor.
     * @param pub The pub that has the drink
     * @param visitor The visitor that bought the drink
     */
    public void sellTo(Pub pub, Visitor visitor) {
        pub.sellDrinkToVisitor(this, visitor);
    }

    /**
     * Gets the sound the drink makes when it is drank.
     * @return drinking sound of the drink
     */
    abstract String getDrinkSound();
}
