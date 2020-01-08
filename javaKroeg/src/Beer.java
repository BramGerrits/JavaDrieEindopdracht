public class Beer extends Drink {
    public Beer(){
        super(2.50);
    }

    public String getDrinkSound(){
        return "KLONKLONKLONKLONKLOK";
    }

    @Override
    public void orderedBy(Event event) {

    }

    @Override
    public void sellTo(Visitor visitor) {

    }
}
