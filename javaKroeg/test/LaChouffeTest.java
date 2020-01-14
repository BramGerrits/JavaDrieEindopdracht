import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaChouffeTest {

    @Test
    public void getPrice() {
        LaChouffe laChouffe = new LaChouffe();
        assertEquals(laChouffe.getPrice(), 2.50);
    }

    @Test
    public void sellTo() {
        LaChouffe laChouffe = new LaChouffe();
        Pub pub = new Pub("kroeg", 1000.00);
        Visitor visitor = new Visitor();

        pub.procureOneDrink(laChouffe);

        laChouffe.sellTo(pub, visitor);
        assertEquals(visitor.getDrinks().size(),1);
    }

    @Test
    public void getDrinkSound() {
        LaChouffe laChouffe = new LaChouffe();
        assertEquals(laChouffe.getDrinkSound(), "KLONK");
    }
}