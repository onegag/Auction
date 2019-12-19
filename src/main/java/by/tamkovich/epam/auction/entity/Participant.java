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

    @Override
    public void run() {




    }

    @Override
    public void update() {
        AtomicLong currentPrice = bid.getCurrentPrice();
        AtomicInteger step = bid.getStep();


    }
}
