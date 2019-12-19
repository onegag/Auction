package by.tamkovich.epam.auction.entity;

import by.tamkovich.epam.auction.entity.observerapi.Observer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Participant implements Runnable, Observer {
    private final int participantId;
    AtomicLong capital;
    DecisionType decisionType;
    Bid bid;

    public Participant(int participantId, AtomicLong startCapital) {
        this.participantId = participantId;
        this.capital = startCapital;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    @Override
    public void run() {
        while(!bid.timeOut.get()){

        }




    }

    @Override
    public void update(Bid bid) {
        AtomicLong currentPrice = bid.getCurrentPrice();
        AtomicInteger step = bid.getStep();


    }
}
