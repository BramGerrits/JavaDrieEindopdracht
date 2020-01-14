import java.lang.reflect.Array;
import java.util.ArrayList;

public class Visitor {
    private ArrayList<Coin> coins;
    private ArrayList<Drink> drinks;

    /**
     * The constructor of the visitor.
     * Makes an ArrayList with all the coins from the visitor.
     * Makes an ArrayList with all the drinks bought by the visitor.
     */
    public Visitor() {
        this.coins = new ArrayList<Coin>();
        this.drinks = new ArrayList<Drink>();
    }

    /**
     * Get the ArrayList with all the coins form the visitor.
     * @return The ArrayList with all the coins form the visitor.
     */
    public ArrayList<Coin> getCoins() {
        return this.coins;
    }

    /**
     * Get the ArrayList with all the drinks form the visitor.
     * @return The ArrayList with all the drinks form the visitor.
     */
    public ArrayList<Drink> getDrinks() {
        return this.drinks;
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
}
