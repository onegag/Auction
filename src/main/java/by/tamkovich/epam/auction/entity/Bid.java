package by.tamkovich.epam.auction.entity;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Bid {
    AtomicLong currentPrice;
    AtomicInteger step;
    AtomicInteger ownerId ;
    AtomicBoolean timeOut;


    public Bid(Lot lot) {
        currentPrice.set(lot.getStartPrice());
        step.set((int)lot.getStartPrice()/100);
        timeOut.set(false);
    }

    public AtomicLong getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(AtomicLong currentPrice) {
        this.currentPrice = currentPrice;
    }

    public AtomicInteger getStep() {
        return step;
    }

    public void setStep(AtomicInteger step) {
        this.step = step;
    }
}
