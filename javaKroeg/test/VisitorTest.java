import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {

    @Test
    public void getCoins() {
        Pub pub = new Pub("Zwetser", 100.00);
        Visitor visitor = new Visitor();
        pub.sellCoinsToVisitor(2, visitor);

        assertEquals(2, visitor.getCoins().size());
    }

    @Test
    public void getDrinks() {
        Pub pub = new Pub("Zwetser", 100.00);
        Visitor visitor = new Visitor();
        Beer beer = new Beer();
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.sellCoinToVisitor(new Coin(), visitor);
        pub.sellDrinkToVisitor(beer, visitor);
        drinks.add(beer);

        assertEquals(drinks, visitor.getDrinks());
    }

    @Test
    public void buyCoins() {
        Visitor visitor = new Visitor();

        visitor.buyCoins(2);
        assertEquals(2, visitor.getCoins().size());
    }
}