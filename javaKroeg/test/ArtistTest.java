import mainPackage.Artist;
import mainPackage.Event;
import mainPackage.Pub;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {
    protected Artist sjors = new Artist("Rapper Sjors", 850);

    @Test
    void getName() {
        assertEquals("Rapper Sjors", this.sjors.getName());
    }

    @Test
    void getPrice() {
        assertEquals(850, this.sjors.getPrice());
    }

    @Test
    void orderedBy() {
        Pub cafeGroothuis = new Pub("Cafe Groothuis", 1000);
        Event kerstGala = new Event("Kerst Gala");
        cafeGroothuis.addEvent(kerstGala);

        this.sjors.orderedBy(kerstGala);

        HashSet<Artist> expectedArtists = new HashSet<>();

        for (Artist artist : kerstGala.getArtists()) {
            expectedArtists.add(artist);
        }

        assertEquals(expectedArtists, kerstGala.getArtists());
    }
}