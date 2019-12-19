package by.tamkovich.epam.auction.entity;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Bid {
    AtomicLong currentPrice;
    AtomicInteger step;

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
