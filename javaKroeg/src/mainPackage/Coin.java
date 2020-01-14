package mainPackage;

public class Coin implements Purchaseable {
    private final static double price = 2.50;

    /**
     * Get the price of one coin.
     * @return The price of one coin
     */
    @Override
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the default price of one coin
     * @return The default price of one coin
     */
    public static double getDefaultPrice() {
        return price;
    }

    /**
     * Sells the coin from the pub to the visitor.
     * @param pub The pub that has the coin
     * @param visitor The visitor that bought the coin
     */
    public void sellTo(Pub pub, Visitor visitor) {
        pub.sellCoinToVisitor(this, visitor);
    }
}
