package by.tamkovich.epam.auction.entity;

public class Lot {
    private final int lotId;
    private final long startPrice;
    private boolean isSoldOut;

    public Lot(int lotId, long startPrice) {
        this.lotId = lotId;
        this.startPrice = startPrice;
        isSoldOut = false;
    }

    public int getLotId() {
        return lotId;
    }

    public long getStartPrice() {
        return startPrice;
    }


    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

}
