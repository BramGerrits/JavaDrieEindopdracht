import mainPackage.Coin;
import mainPackage.Pub;
import mainPackage.Visitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTest {
    protected Pub cafeGroothuis = new Pub("Cafe Groothuis", 1000);
    protected Visitor mark = new Visitor();
    protected Coin coin = new Coin();

    @Test
    public void getPrice() {
        assertEquals(2.50, this.coin.getPrice());
    }

    @Test
    public void getDefaultPrice() {
        assertEquals(2.50, Coin.getDefaultPrice());
    }

    @Test
    public void sellTo() {
        this.coin.sellTo(cafeGroothuis, mark);
        assertEquals(1002.5, cafeGroothuis.getTotalBudget());
        assertEquals(1, mark.getCoins().size());
    }
}