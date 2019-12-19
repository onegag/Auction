package by.tamkovich.epam.auction.entity.observerapi;

import by.tamkovich.epam.auction.entity.Auction;
import by.tamkovich.epam.auction.entity.Bid;

public interface Observer {
    void update(Bid bid);
}
