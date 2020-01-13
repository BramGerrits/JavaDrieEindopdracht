import java.util.ArrayList;

public class Visitor {
    private ArrayList<Coin> coins;

    public Visitor() {
        this.coins = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoins() {
        return this.coins;
    }

    /**
     * Lets the visitor buy a coin for the pub.
     * @param amount Amount of coins that the visitor wants to buy
     */
    public void buyCoins(int amount) {
        for (int i = 0; i < amount; i++) {
            this.coins.add(new Coin());
        }
    }

    /**
     * Lets the visitor buy a drink with a coin
     * @param drink The drink the visitor wants to buy
     */
    public void buyDrink(Drink drink) {
        double price = drink.getPrice();
        int priceInCoins = 1;
    }
}
