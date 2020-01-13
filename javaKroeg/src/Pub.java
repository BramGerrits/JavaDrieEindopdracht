import java.util.ArrayList;

public class Pub {
    private String name;
    private double budget;
    private ArrayList<Event> events;
    private ArrayList<Drink> drinks;

    /**
     * Constructor for the pub class
     * @param name The name of the pub
     * @param budget The start budget of the pub
     */
    public Pub(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.events = new ArrayList<Event>();
        this.drinks = new ArrayList<Drink>();
    }

    /**
     * Gets the name of the pub.
     * @return Pub name
     */
    public String getName() {
        return this.name;
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
        return false;
    }

    public void procureOneDrink(Drink drink) {
        if(this.budget > drink.getPrice()) {
            this.budget -= drink.getPrice();
            drink.setProcured();
            this.drinks.add(drink);
        } else {
            System.out.println("Niet genoeg keld");
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

    public void sellDrinkToVisitor(DrinkType drinkType, Visitor visitor) {
        Drink boughtDrink = getAvailableDrink(drinkType);
        if(boughtDrink != null) {
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
        } else {
            System.out.println("Drinken is opppprdepop");
        }
    }

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
}
