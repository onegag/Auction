package by.tamkovich.epam.auction.logic;

import by.tamkovich.epam.auction.entity.Auction;
import by.tamkovich.epam.auction.entity.Bid;
import by.tamkovich.epam.auction.entity.Participant;

public class RaisePriceForCurrentStep implements Decision {
    @Override
    public void make(Participant participant, Bid bid) {
        Auction auction = Auction.getInstance();

    }
}
