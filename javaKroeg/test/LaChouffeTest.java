import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaChouffeTest {
    protected LaChouffe laChouffe = new LaChouffe();
    protected Pub pub = new Pub("Zwetser", 1000.00);
    protected Visitor visitor = new Visitor();

    @Test
    public void getPrice() {
        assertEquals(laChouffe.getPrice(), 2.50);
    }

    @Test
    public void sellTo() {
        pub.procureOneDrink(laChouffe);
        pub.sellCoinsToVisitor(10, visitor);

        laChouffe.sellTo(pub, visitor);
        assertEquals(visitor.getDrinks().size(),1);
    }

    @Test
    public void getDrinkSound() {
        assertEquals(laChouffe.getDrinkSound(), "KLONK");
    }
}