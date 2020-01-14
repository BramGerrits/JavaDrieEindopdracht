import mainPackage.Artist;
import mainPackage.Event;
import mainPackage.Pub;
import mainPackage.Visitor;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {
    protected Pub cafeGroothuis = new Pub("Cafe Groothuis", 1000);
    protected Event kerstGala = new Event("Kerst Gala");
    protected Artist bollejan = new Artist("Boolejan", 50);
    protected Visitor mark = new Visitor();
    protected Visitor bram = new Visitor();

    @Test
    public void getName() {
        assertEquals("Kerst Gala", kerstGala.getName());
    }

    @Test
    public void getArtists() {
        cafeGroothuis.addEvent(kerstGala);
        bollejan.orderedBy(kerstGala);
        HashSet<Artist> expectedArtists = new HashSet<>();

        for (Artist artist : kerstGala.getArtists()) {
            expectedArtists.add(artist);
        }

        assertEquals(expectedArtists, kerstGala.getArtists());
    }

    @Test
    public void addVisitor() {
        kerstGala.addVisitor(mark);
        kerstGala.addVisitor(bram);
        assertEquals(2, kerstGala.getAmountOfVisitors());
    }

    @Test
    public void getAmountOfVisitors() {
        kerstGala.addVisitor(mark);
        kerstGala.addVisitor(bram);
        assertEquals(2, kerstGala.getAmountOfVisitors());
        assertEquals(20, kerstGala.getProfit());
    }

    @Test
    public void hireArtist() {
        kerstGala.hireArtist(bollejan);
        HashSet<Artist> expectedArtists = new HashSet<>();

        for (Artist artist : kerstGala.getArtists()) {
            expectedArtists.add(artist);
        }

        assertEquals(expectedArtists, kerstGala.getArtists());
    }

    @Test
    public void getSpendings() {
        kerstGala.hireArtist(bollejan);
        assertEquals(50, kerstGala.getSpendings());
    }

    @Test
    public void getProfit() {
        kerstGala.addVisitor(mark);
        assertEquals(10, kerstGala.getProfit());
    }
}