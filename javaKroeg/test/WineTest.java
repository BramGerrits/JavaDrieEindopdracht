import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WineTest {
    protected Pub pub = new Pub("kroeg", 1000);
    protected Wine wine = new Wine();
    protected Visitor visitor = new Visitor();

    @Test
    public void getPrice() {
        assertEquals(wine.getPrice(), 2.50);
    }

    @Test
    public void sellTo() {
        pub.procureOneDrink(wine);
        pub.sellCoinsToVisitor(10, visitor);

        wine.sellTo(pub, visitor);
        assertEquals(visitor.getDrinks().size(),1);
    }

    @Test
    public void getDrinkSound() {
        assertEquals(wine.getDrinkSound(), "SLUUUUUUUUUUUUUURP");
    }
}