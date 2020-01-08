public interface Purchaseable {
    public double getPrice();
    public void sellTo(Visitor visitor);
}
