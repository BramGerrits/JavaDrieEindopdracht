import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PubTest {

    @Test
    public void getName() {
        Pub pub = new Pub("Zwetser", 100);
        assertEquals(pub.getName(), "Zwetser");
    }

    @Test
    public void addEvent() {
        Pub pub = new Pub("Zwetser", 100);
        Event event = new Event("Gala");
        ArrayList<Event> events = new ArrayList<Event>();

        pub.addEvent(event);
        events.add(event);

        assertEquals(events, pub.getEvents());
    }

    @Test
    public void getEvents() {
        Pub pub = new Pub("Zwetser", 100);
        Event event = new Event("Gala");
        ArrayList<Event> events = new ArrayList<Event>();

        pub.addEvent(event);
        events.add(event);

        assertEquals(events, pub.getEvents());
    }

    @Test
    public void getTotalBudget() {
        Pub pub = new Pub("Zwetser", 100.00);
        assertEquals(100.00, pub.getTotalBudget());
    }

    @Test
    public void checkIfBankrupt() {
        Pub pub = new Pub("Zwetser", -10.00);
        assertTrue(pub.checkIfBankrupt());
    }

    @Test
    public void procureOneDrink() {
        Pub pub = new Pub("Zwetser", 10.00);
        LaChouffe drink = new LaChouffe();
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.procureOneDrink(drink);
        drinks.add(drink);

        assertEquals(drinks, pub.getDrinks());
    }

    @Test
    public void procureDrink() {
        Pub pub = new Pub("Zwetser", 10.00);
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        pub.procureDrink(DrinkType.BEER, 2);
        assertEquals(2, pub.getDrinks().size());
    }

    @Test
    public void sellCoinsToVisitor() {
        Pub pub = new Pub("Zwetser", 10.00);
        Visitor visitor = new Visitor();

        pub.sellCoinsToVisitor(2, visitor);

        assertEquals(2, visitor.getCoins().size());
    }

    @Test
    public void sellCoinToVisitor() {
        Pub pub = new Pub("Zwetser", -10.00);
        Coin coin = new Coin();
        Visitor visitor = new Visitor();
        ArrayList<Coin> coins = new ArrayList<Coin>();

        pub.sellCoinToVisitor(coin, visitor);
        coins.add(coin);

        assertEquals(coins, visitor.getCoins());
    }

    @Test
    public void sellDrinkToVisitor() {
        Pub pub = new Pub("Zwetser", 10.00);
        Visitor visitor = new Visitor();

        pub.sellCoinsToVisitor(3, visitor);

        pub.procureDrink(DrinkType.BEER, 3);

        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);
        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);
        pub.sellDrinkToVisitor(DrinkType.BEER, visitor);

        assertEquals(3, visitor.getDrinks().size());
    }

    @Test
    public void sellDrinkToVisitor1() {
        Pub pub = new Pub("Zwetser", 10.00);
        Visitor visitor = new Visitor();
        Coin coin = new Coin();
        Beer beer = new Beer();

        pub.procureOneDrink(beer);
        pub.sellCoinToVisitor(coin, visitor);
        pub.sellCoinsToVisitor(1, visitor);
        pub.sellDrinkToVisitor(beer, visitor);

        assertEquals(1, visitor.getDrinks().size());
    }

    @Test
    public void closeEvent() {
        Pub pub = new Pub("Zwetser", 10.00);
        Event event = new Event("Gala");
        Artist artist = new Artist("Jan Smit", 5.00);

        pub.addEvent(event);
        event.hireArtist(artist);

        pub.closeEvent(event);

        assertEquals(5.00, pub.getTotalBudget());
    }
}