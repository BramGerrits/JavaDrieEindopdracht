public class Main {
    public static void main(String[] args){
        Pub zwetser = new Pub("Zwetser", 1000);
        Event event = new Event("Kerst Gala");
        zwetser.addEvent(event);

        Artist sjors = new Artist("Sjors", 2.88);
        //event.hireArtist(sjors);

        sjors.orderedBy(event);
        event.printAllArtistForEvent();

        Visitor bram = new Visitor();
        event.addVisitor(bram);

        bram.buyCoins(2);

        System.out.println(bram.getCoins());

        Coin coin = new Coin();
        coin.sellTo(bram);

        System.out.println(bram.getCoins());

        System.out.println(event.getAmountOfVisitors());
    }
}
