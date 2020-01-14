public class Main {
    public static void main(String[] args){
        Pub zwetser = new Pub("Zwetser", 1000);
        Event event = new Event("Kerst Gala");
        zwetser.addEvent(event);

        Artist sjors = new Artist("Sjors", 2.88);
        event.hireArtist(sjors);
        sjors.orderedBy(event);

        Visitor bram = new Visitor();
        event.addVisitor(bram);
        zwetser.sellCoinsToVisitor(2, bram);

        System.out.println("Coins van Bram: " + bram.getCoins().size());

        zwetser.procureDrink(DrinkType.BEER, 2);
        System.out.println();
        System.out.println("Huidige budget: " + zwetser.getTotalBudget());

        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);
        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);
        zwetser.sellDrinkToVisitor(DrinkType.BEER, bram);

        System.out.println("Profit: " + event.getProfit());
        System.out.println("Spendings: " + event.getSpendings());

        zwetser.closeEvent(event);

        System.out.println("Huidige budget: " + zwetser.getTotalBudget());
        System.out.println("Aantal bezoekers: " + event.getAmountOfVisitors());
        System.out.println();
        System.out.println("Coins van Bram: " + bram.getCoins().size());
    }
}
