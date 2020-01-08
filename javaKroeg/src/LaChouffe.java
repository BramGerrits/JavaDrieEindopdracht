public class LaChouffe extends Drink {
    public LaChouffe(){
        super(2.50);
    }

    public String getDrinkSound(){
        return "KLONK";
    }

    @Override
    public void orderedBy(Event event) {

    }

    @Override
    public void sellTo(Visitor visitor) {

    }
}
