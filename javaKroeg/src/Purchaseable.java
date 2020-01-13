public interface Purchaseable {
    double getPrice();
    void sellTo(Visitor visitor);
}
