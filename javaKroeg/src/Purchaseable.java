public interface Purchaseable {
    final static double price = 0.0;

    public static double getPrice(){
        return price;
    }
    public void sellTo(Visitor visitor);
}
