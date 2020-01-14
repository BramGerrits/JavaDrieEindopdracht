import org.junit.jupiter.api.Test;

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
        pub.addEvent(event);
        assertEquals(pub.getName(), "Zwetser");
    }

    @Test
    public void getTotalBudget() {
    }

    @Test
    public void checkIfBankrupt() {
    }

    @Test
    public void procureOneDrink() {
    }

    @Test
    public void procureDrink() {
    }

    @Test
    public void sellCoinsToVisitor() {
    }

    @Test
    public void sellCoinToVisitor() {
    }

    @Test
    public void sellDrinkToVisitor() {
    }

    @Test
    public void sellDrinkToVisitor1() {
    }

    @Test
    public void closeEvent() {
    }
}