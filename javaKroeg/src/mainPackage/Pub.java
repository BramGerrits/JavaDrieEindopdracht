package mainPackage;

import mainPackage.drinks.Beer;
import mainPackage.drinks.Drink;
import mainPackage.drinks.LaChouffe;
import mainPackage.drinks.Wine;

import java.util.ArrayList;

public class Pub {
    private String name;
    private double budget;
    private ArrayList<Event> events;
    private ArrayList<Drink> drinks;

    /**
     * Constructor for the pub class.
     * Sets the name and start budget.
     * Makes the events and drinks ArrayList.
     * @param name The name of the pub
     * @param budget The start budget of the pub
     */
    public Pub(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.events = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    /**
     * Gets the name of the pub.
     * @return Pub name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets all the events of this pub.
     * @return events
     */
    public ArrayList<Event> getEvents() {
        return this.events;
    }

    /**
     * Gets all the drinks of this pub.
     * @return drinks
     */
    public ArrayList<Drink> getDrinks() {
        return this.drinks;
    }

    /**
     * Adds an event that will take place at the pub.
     * @param event Event object
     */
    public void addEvent(Event event) {
        this.events.add(event);
    }

    /**
     * Get total budget of the pub.
     * @return double The total budget of the pub
     */
    public double getTotalBudget() {
        return this.budget;
    }

    /**
     * Checks if the pub can afford events.
     * @return if the pub is bankrupt
     */
    public boolean checkIfBankrupt() {
        if (budget < 0){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Procures one drink and adds it to the drinks ArrayList.
     * Removes the price of the drink from the budget.
     * Checks if the pub is bankrupt.
     * @param drink Drink that is procured.
     */
    public void procureOneDrink(Drink drink) {
        if(!checkIfBankrupt()) {
            if (this.budget > drink.getPrice()) {
                this.budget -= drink.getPrice();
                this.drinks.add(drink);
            } else {
                System.out.println("Niet genoeg keld");
            }
        }
    }

    /**
     * Procures drinks for the events.
     * @param drink What kind of drink the pub wants to procure
     * @param amount How much of that drink the pub wants to procure
     */
    public void procureDrink(DrinkType drink, int amount) {
        for (int i = 0; i < amount; i++) {
            switch (drink){
                case BEER:
                    procureOneDrink(new Beer());
                    break;
                case WINE:
                    procureOneDrink(new Wine());
                    break;
                case LACHOUFFE:
                    procureOneDrink(new LaChouffe());
                    break;
                default:
                    System.out.println("Geen legale drink ingevoerd");
                    break;
            }
        }
    }

    /**
     * Sells coins to the visitor and adds the profit of that coins to the budget.
     * @param amount Amount of coins that were bought
     * @param visitor The visitor that buys the coins
     */
    public void sellCoinsToVisitor(int amount, Visitor visitor){
        visitor.buyCoins(amount);
        this.budget += Coin.getDefaultPrice() * amount;
    }

    /**
     * Sells one coin to the visitor and updates the budget of the pub.
     * @param coin The coin that is bought by the visitor
     * @param visitor The visitor that buys a coin
     */
    public void sellCoinToVisitor(Coin coin, Visitor visitor){
        visitor.getCoins().add(coin);
        this.budget += coin.getPrice();
    }

    /**
     * Sells a drink to a visitor.
     * @param drinkType The kind of drink that the visitor wants
     * @param visitor The visitor that orders a drink
     */
    public void sellDrinkToVisitor(DrinkType drinkType, Visitor visitor) {
        Drink boughtDrink = getAvailableDrink(drinkType);
        sellDrinkToVisitor(boughtDrink, visitor);
    }

    /**
     * Checks if the visitor got its drink.
     * Removes the coins from the visitor if they have enough.
     * @param boughtDrink The drink object the visitor bought
     * @param visitor The visitor that bought a drink
     */
    public void sellDrinkToVisitor(Drink boughtDrink, Visitor visitor) {
        if(boughtDrink != null) {
            if(this.drinks.contains(boughtDrink)) {
                double price = boughtDrink.getPrice();
                double coinPrice = Coin.getDefaultPrice();

                int priceInCoins = (int) Math.ceil(price / coinPrice);
                if (visitor.getCoins().size() >= priceInCoins) {
                    for (int i = 0; i < priceInCoins; i++) {
                        visitor.getCoins().remove(0);
                    }
                    visitor.getDrinks().add(boughtDrink);
                    this.drinks.remove(this.drinks.indexOf(boughtDrink));
                    System.out.println(this.drinks);
                } else {
                    System.out.println("Keen keld wel honger");
                }
            }
            else{
                System.out.println("Drankje is niet ingekocht door pub");
            }
        } else {
            System.out.println("Drinken is opppprdepop");
        }
    }

    /**
     * Checks if the pub has the drink procured.
     * @param drinkType The type of drink
     * @return The drink object that is procured by the pub.
     */
    private Drink getAvailableDrink(DrinkType drinkType) {
        switch (drinkType) {
            case BEER:
                for (int i = 0; i < this.drinks.size(); i++) {
                    if(this.drinks.get(i) instanceof Beer) {
                        return this.drinks.get(i);
                    }
                }
                break;
            case WINE:
                for (int i = 0; i < this.drinks.size(); i++) {
                    if(this.drinks.get(i) instanceof Wine) {
                        return this.drinks.get(i);
                    }
                }
                break;
            case LACHOUFFE:
                for (int i = 0; i < this.drinks.size(); i++) {
                    if(this.drinks.get(i) instanceof LaChouffe) {
                        return this.drinks.get(i);
                    }
                }
                break;
            default:
                System.out.println("Geen legale drink ingevoerd");
                break;
        }
        return null;
    }

    /**
     * Closes the event and lets the pub pay of gets their profit.
     * @param event The event that wants to be closed
     */
    public void closeEvent(Event event){
        double totalProfit = event.getProfit() - event.getSpendings();
        this.budget += totalProfit;
    }
}
