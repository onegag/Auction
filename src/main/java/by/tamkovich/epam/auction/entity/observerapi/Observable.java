package by.tamkovich.epam.auction.entity.observerapi;

import by.tamkovich.epam.auction.entity.Bid;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Bid bid);
}
