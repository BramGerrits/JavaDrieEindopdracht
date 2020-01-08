import Drinks.Drink;

import java.util.ArrayList;

public class Pub {
    private String name;
    private double budget;
    private ArrayList<Event> events;
    private ArrayList<Drink> drinks;

    /**
     * Gets the name of the pub.
     * @return Pub name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an event that will take place at the pub.
     * @param event Event object
     */
    public void addEvent(Event event) {

    }

    /**
     * Get total budget of the pub.
     * @return double The total budget of the pub
     */
    public double getTotalBudget() {
        return 0.0;
    }

    /**
     * Checks if the pub can afford events.
     * @return if the pub is bankrupt
     */
    public boolean checkIfBankrupt() {
        return false;
    }

    /**
     * Procures drinks for the events.
     * @param drink What kind of drink the pub wants to procure
     * @param amount How much of that drink the pub wants to procure
     */
    public void procureDrink(Drink drink, int amount) {

    }
}
