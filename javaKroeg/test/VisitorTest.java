import mainPackage.drinks.Beer;
import mainPackage.drinks.Drink;
import mainPackage.Coin;
import mainPackage.Pub;
import mainPackage.Visitor;
import mainPackage.exceptions.PubException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    protected Visitor visitor = new Visitor();
    protected Pub pub = new Pub("Zwetser", 100.00);
    protected Beer beer = new Beer();

    @Test
    public void getCoins() {
        pub.sellCoinsToVisitor(2, visitor);

        assertEquals(2, visitor.getCoins().size());
    }

    @Test
    public void getDrinks() throws PubException {
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.sellCoinToVisitor(new Coin(), visitor);
        pub.sellCoinToVisitor(new Coin(), visitor);

        pub.procureOneDrink(beer);

        pub.sellDrinkToVisitor(beer, visitor);
        drinks.add(beer);

        assertEquals(drinks, visitor.getDrinks());
    }

    @Test
    public void buyCoins() {
        visitor.buyCoins(2);
        assertEquals(2, visitor.getCoins().size());
    }
}