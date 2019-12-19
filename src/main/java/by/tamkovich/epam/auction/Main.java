package by.tamkovich.epam.auction;

import by.tamkovich.epam.auction.entity.Auction;
import by.tamkovich.epam.auction.entity.Bid;
import by.tamkovich.epam.auction.entity.Lot;
import by.tamkovich.epam.auction.entity.Participant;
import by.tamkovich.epam.auction.parser.LotParser;
import by.tamkovich.epam.auction.parser.ParticipantParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    private static final String PARTICIPANTS = "json/participants.json";
    private static final String LOTS = "json/deals.json";
    private static Lock lock = new ReentrantLock(false);
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        ParticipantParser participantParser = new ParticipantParser();
        List<Participant> participants = participantParser.readJson(PARTICIPANTS);

        LotParser lotParser = new LotParser();
        List<Lot> lots = lotParser.readJson(LOTS);

        Auction auction = Auction.getInstance();
        participants.forEach(participant -> auction.addObserver(participant));

        for (Lot currentLot:lots) {
            Bid bid = new Bid(currentLot);



        }



    }
    
}
