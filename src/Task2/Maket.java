package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Maket implements MarketBehaviour, QueueBehaviour {
    List<Actor> listActorsInMarket;
    List<Actor> listActorsInQueue;
    List<Actor> listActorsOutQueue;

    Random r;


    public Maket() {
        this.listActorsInMarket = new ArrayList<>();
        this.listActorsInQueue = new ArrayList<>();
        this.r = new Random();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        listActorsInMarket.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            listActorsInMarket.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        listActorsInQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        if (!listActorsInQueue.isEmpty()) {
            Actor actor = listActorsInQueue.get(r.nextInt(listActorsInQueue.size()));
            if (actor.isTakeOrder) {
                actor.setMakeOrder();
            }
        }
    }

    @Override
    public void giveOrders() {
        if (!listActorsInQueue.isEmpty()) {
            Actor actor = listActorsInQueue.get(r.nextInt(listActorsInQueue.size()));
            if (actor.isMakeOrder) {
                actor.setTakeOrder();
            }

        }
    }

    @Override
    public void releaseFromQueue() {
        for (Actor actor : listActorsInQueue) {
            if (actor.isTakeOrder) {
                listActorsOutQueue.add(actor);
                listActorsInMarket.remove(actor);
            }
        }
    }
}
