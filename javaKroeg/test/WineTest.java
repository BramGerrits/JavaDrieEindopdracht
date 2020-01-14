import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WineTest {

    @Test
    public void getPrice() {
        Wine wine = new Wine();
        assertEquals(wine.getPrice(), 2.50);
    }

    @Test
    public void sellTo() {
        Wine wine = new Wine();
        Pub pub = new Pub("kroeg", 1000.00);
        Visitor visitor = new Visitor();

        pub.procureOneDrink(wine);
        pub.sellCoinsToVisitor(10, visitor);

        wine.sellTo(pub, visitor);
        assertEquals(visitor.getDrinks().size(),1);
    }

    @Test
    public void getDrinkSound() {
        Wine wine = new Wine();
        assertEquals(wine.getDrinkSound(), "SLUUUUUUUUUUUUUURP");
    }
}