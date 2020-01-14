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

    public HashSet<Artist> getArtists() {
        return this.artists;
    }

    /**
     * Adds a visitor to the event.
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

    public void printAllArtistForEvent(){
        for (Artist artist : artists) {
            System.out.println(artist.getName() + " - " + artist.getPrice());
        }
    }

    public void hireArtist(Artist artist){
        if(!this.artists.contains(artist)) {
            this.artists.add(artist);
            spendings += artist.getPrice();
        } else{
            System.out.println("Artiest is al ingehuurd voor dit evenement");
        }
    }

    public double getSpendings(){
        return this.spendings;
    }

    public double getProfit(){
        return this.profit;
    }
}
