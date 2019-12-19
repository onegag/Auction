package by.tamkovich.epam.auction.entity.observerapi;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
