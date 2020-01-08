import java.util.HashSet;

public class Event {
    private String name;
    private HashSet<Visitor> visitors;
    private HashSet<Artist> artists;

    /**
     * The constructor for an event.
     * @param name The name of the event
     */
    public Event(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the event.
     * @return The event name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Hires an artist and lets the pub pay for the artist.
     * @param artist What artist is going to preform at the pub
     */
    public void hireArtist(Artist artist) {

    }

    /**
     * Adds a visitor to the event.
     * @param visitor Visitor Object
     */
    public void addVisitor(Visitor visitor) {

    }

    /**
     * Gets the amount of visitors at the event.
     * @return The amount of visitors at the event
     */
    public int getAmountOfVisitors() {

    }
}
