import mainPackage.drinks.Drink;
import mainPackage.drinks.DrinkType;
import mainPackage.drinks.LaChouffe;
import mainPackage.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PubTest {
    protected Pub pub = new Pub("Zwetser", 100.00);
    protected Pub bankruptPub = new Pub("Zwetser", -10.00);
    protected Event event = new Event("Gala");
    protected LaChouffe drink = new LaChouffe();
    protected Visitor visitor = new Visitor();
    protected Coin coin = new Coin();
    protected Artist artist = new Artist("Jan Smit", 6.90);

    @Test
    public void getName() {
        assertEquals(pub.getName(), "Zwetser");
    }

    @Test
    public void addEvent() {
        ArrayList<Event> events = new ArrayList<Event>();

        pub.addEvent(event);
        events.add(event);

        assertEquals(events, pub.getEvents());
    }

    @Test
    public void getEvents() {
        ArrayList<Event> events = new ArrayList<Event>();

        pub.addEvent(event);
        events.add(event);

        assertEquals(events, pub.getEvents());
    }

    @Test
    public void getTotalBudget() {
        assertEquals(100.00, pub.getTotalBudget());
    }

    @Test
    public void checkIfBankrupt() {
        assertTrue(bankruptPub.checkIfBankrupt());
    }

    @Test
    public void procureOneDrink() {
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.procureOneDrink(drink);
        drinks.add(drink);

        assertEquals(drinks, pub.getDrinks());
    }

    @Test
    public void procureDrink() {
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.procureDrink(DrinkType.BEER, 2);
        assertEquals(2, pub.getDrinks().size());
    }

    @Test
    public void sellCoinsToVisitor() {
        pub.sellCoinsToVisitor(2, visitor);

        assertEquals(2, visitor.getCoins().size());
    }

    @Test
    public void sellCoinToVisitor() {
        ArrayList<Coin> coins = new ArrayList<Coin>();

        pub.sellCoinToVisitor(coin, visitor);
        coins.add(coin);

        assertEquals(coins, visitor.getCoins());
    }

    @Test
    public void sellDrinkToVisitor() {
        pub.sellCoinsToVisitor(3, visitor);

        pub.procureDrink(DrinkType.BEER, 3);

        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);
        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);
        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);

        assertEquals(3, visitor.getDrinks().size());
    }

    @Test
    public void sellDrinkToVisitor1() {
        pub.procureOneDrink(drink);
        pub.sellCoinToVisitor(coin, visitor);
        pub.sellCoinsToVisitor(1, visitor);
        pub.sellDrinkToVisitor(drink, visitor);

        assertEquals(1, visitor.getDrinks().size());
    }

    @Test
    public void closeEvent() {
        pub.addEvent(event);
        event.hireArtist(artist);

        pub.closeEvent(event);

        assertEquals(93.10, pub.getTotalBudget());
    }
}