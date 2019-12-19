package by.tamkovich.epam.auction.entity;

import by.tamkovich.epam.auction.entity.observerapi.Observable;
import by.tamkovich.epam.auction.entity.observerapi.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Auction implements Observable {

    private static Logger logger = LogManager.getLogger();

    private static Auction instance;
    private static AtomicBoolean initialized = new AtomicBoolean(false);

    private List<Observer> observerList = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();

    private static Lock lock = new ReentrantLock();
    private ExecutorService executorService = Executors.newCachedThreadPool();

    private Auction() {
        if(instance != null){
            throw new RuntimeException("Please use getInstance() method");
        }
    }

    public static Auction getInstance(){
        if(!initialized.get()){
            try {
                lock.lock();
                if (instance == null) {
                    instance = new Auction();
                    initialized.set(true);
                }
            }finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void playLot(Bid bid){
        participants.forEach(participant -> executorService.execute(new Thread(participant)));
        notifyObserver(bid);
    }






    @Override
    public void addObserver(Observer observer) {
        if (observer == null) {
            logger.warn("Error, observer can't be null");
            throw new IllegalArgumentException("Error in addObserverMethod");
        }
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver(Bid bid) {
        for (Observer o : observerList) {
        o.update(bid);


    }
}
}
