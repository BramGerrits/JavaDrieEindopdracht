public interface Purchaseable {
    double getPrice();
    void sellTo(Pub pub, Visitor visitor);
}
