public abstract class Drink implements Orderable, Purchaseable {
    private double price = 0.0;
    private boolean isProcured = false;
    private boolean isOrdered = false;

    public Drink(double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean checkIfProcured() {
        return this.isProcured;
    }

    public void setProcured() {
        this.isProcured = true;
    }

    /**
     * Gets the sound the drink makes when it is drank.
     * @return drinking sound of the drink
     */
    abstract String getDrinkSound();
}
