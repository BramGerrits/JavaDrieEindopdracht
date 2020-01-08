package Drinks;

public class Beer extends Drink {
    public Beer(){
        super(1, 2.50);
    }

    public String getDrinkSound(){
        return "KLONKLONKLONKLONKLOK";
    }
}
