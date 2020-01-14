package mainPackage;

import mainPackage.exceptions.PubException;

public interface Purchaseable {
    double getPrice();
    void sellTo(Pub pub, Visitor visitor) throws PubException;
}
