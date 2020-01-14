import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    @Test
    void getName() {
        Artist sjors = new Artist("Rapper Sjors", 850);

        assertEquals("Rapper Sjors", sjors.getName());
    }

    @Test
    void getPrice() {
    }

    @Test
    void orderedBy() {
    }
}