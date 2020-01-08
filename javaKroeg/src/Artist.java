public class Artist implements Orderable{
    private String name;
    private double price;

    /**
     * The constructor of the artist
     * @param name The name of the artist
     * @param price The price of the artist
     */
    public Artist(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the artist
     * @return Artist name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the price that the pub has to pay for hiring an artist.
     * @return The price of the artist
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the pub that hired the artist.
     * @param event Event Object
     */
    public void orderedBy(Event event) {
        event.getArtists().add(this);
    }
}
