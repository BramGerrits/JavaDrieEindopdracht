public class Coin implements Purchaseable {
    private final static double price = 2.50;

    /**
     * Get the price of one coin.
     * @return The price of one coin
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sell coin to a visitor.
     * @param visitor Visitor
     */
    public void sellTo(Visitor visitor) {
        visitor.getCoins().add(this);
    }
}
