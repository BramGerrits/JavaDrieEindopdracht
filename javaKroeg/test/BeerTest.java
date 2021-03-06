import mainPackage.drinks.Beer;
import mainPackage.Pub;
import mainPackage.Visitor;
import mainPackage.exceptions.PubException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import mainPackage.*;

public class BeerTest {
    protected Pub cafeGroothuis = new Pub("Cafe Groothuis", 1000);
    protected Visitor mark = new Visitor();
    protected Beer beer = new Beer();

    @Test
    public void getPrice() {
        assertEquals(2.40, this.beer.getPrice());
    }

    @Test
    public void sellTo() throws PubException {
        cafeGroothuis.procureOneDrink(this.beer);
        this.mark.buyCoins(1);
        this.beer.sellTo(cafeGroothuis, mark);
        assertEquals(1, mark.getDrinks().size());
    }

    @Test
    public void getDrinkSound() {
        assertEquals("KLONKLONKLONKLONKLOK", this.beer.getDrinkSound());
    }
}