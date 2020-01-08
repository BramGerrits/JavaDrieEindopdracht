public class Main {
    public static void main(String[] args){
        Pub zwetser = new Pub("Zwetser", 1000);
        Event event = new Event("Kerst Gala");
        zwetser.addEvent(event);

        Artist sjors = new Artist("Sjors", 2.88);
        //event.hireArtist(sjors);

        sjors.orderedBy(event);

        event.printAllArtistForEvent();
        System.out.println(event.getAmountOfVisitors());
    }
}
