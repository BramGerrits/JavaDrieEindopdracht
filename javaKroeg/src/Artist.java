public class Artist {
    private String name;
    private double price;

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
    public void getOrderedBy(Event event) {

    }
}
