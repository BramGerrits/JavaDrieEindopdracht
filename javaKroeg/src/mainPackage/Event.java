package mainPackage;

import java.util.HashSet;

public class Event {
    private String name;
    private HashSet<Visitor> visitors;
    private HashSet<Artist> artists;
    private double spendings = 0.0;
    private double profit = 0.0;
    private final double entryPrice = 10.00;

    /**
     * The constructor for an event.
     * Sets name for the event.
     * Adds the HashSets for visitors and artists.
     * @param name The name of the event
     */
    public Event(String name) {
        this.name = name;
        this.visitors = new HashSet<Visitor>();
        this.artists = new HashSet<Artist>();
    }

    /**
     * Gets the name of the event.
     * @return The event name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the HashSet with all the artist that are hired for the Event.
     * @return HashSet Artists
     */
    public HashSet<Artist> getArtists() {
        return this.artists;
    }

    /**
     * Adds a visitor to the event and update the profit by getting the entryPrice.
     * @param visitor Visitor Object
     */
    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
        profit += entryPrice;
    }

    /**
     * Gets the amount of visitors at the event.
     * @return The amount of visitors at the event
     */
    public int getAmountOfVisitors() {
        return this.visitors.size();
    }

    /**
     * Hires the artist to the event. The artist is paid.
     * @param artist Artist Object
     */
    public void hireArtist(Artist artist){
        if(!this.artists.contains(artist)) {
            this.artists.add(artist);
            spendings += artist.getPrice();
        } else{
            System.out.println("Artiest is al ingehuurd voor dit evenement");
        }
    }

    /**
     * Get the total spendings.
     * @return the total spendings
     */
    public double getSpendings(){
        return this.spendings;
    }

    /**
     * Gets the total profit.
     * @return the total profit
     */
    public double getProfit(){
        return this.profit;
    }
}
