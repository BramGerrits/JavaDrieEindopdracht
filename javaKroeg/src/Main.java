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

        System.out.println("Coins: " + bram.getCoins().size());

        Beer biertjs = new Beer();

        System.out.println("Coins: " + bram.getCoins().size());

        zwetser.procureDrink(DrinkType.BEER, 2);

        System.out.println(zwetser.getTotalBudget());

        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);
        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);
        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);

        System.out.println("Coins: " + bram.getCoins().size());



        System.out.println(event.getAmountOfVisitors());
    }
}
