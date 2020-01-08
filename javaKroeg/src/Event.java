import java.util.HashSet;

public class Event {
    private String name;
    private HashSet<Visitor> visitors;
    private HashSet<Artist> artists;

    /**
     * Gets the name of the event.
     * @return The event name
     */
    public String getName() {
        return name;
    }

    /**
     * Hires an artist and lets the pub pay for the artist.
     * @param artist What artist is going to preform at the pub
     */
    public void hireArtist(Artist artist) {

    }

    public void addVisitor(Visitor visitor) {

    }

    public int getAmountOfVisitors() {

    }
}
