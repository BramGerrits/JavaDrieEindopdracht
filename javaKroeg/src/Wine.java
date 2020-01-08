public class Wine extends Drink {
    public Wine(){
        super(2.50);
    }

    public String getDrinkSound(){
        return "SLUUUUUUUUUUUUUURP";
    }

    @Override
    public void orderedBy(Event event) {

    }

    @Override
    public void sellTo(Visitor visitor) {

    }
}
