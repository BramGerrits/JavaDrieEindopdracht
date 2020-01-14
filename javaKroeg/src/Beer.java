public class Beer extends Drink {
    public Beer(){
        super(2.40);
    }

    public String getDrinkSound(){
        return "KLONKLONKLONKLONKLOK";
    }

    @Override
    public void orderedBy(Event event) {

    }
}
