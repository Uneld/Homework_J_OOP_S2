package Task2;

import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> listActorsInMarket;
    private final List<Actor> listActorsInQueue;
    private final Set<Actor> listActorsOutQueue;
    private final Random r;

    public void displayInMarket() {
        if (listActorsInMarket.isEmpty()) {
            System.out.println("В магазине нет людей.");
        } else {
            System.out.println("Люди в магазине: " + listActorsInMarket);
        }
    }

    public void displayOutQueue() {
        if (listActorsOutQueue.isEmpty()) {
            System.out.println("Нет людей в магазине после покупки.");
        } else {
            System.out.println("Люди в магазине после покупки: " + listActorsOutQueue);
        }
    }

    public void displayInQueue() {
        if (listActorsInQueue.isEmpty()) {
            System.out.println("Нет людей в очереди.");
        } else {
            System.out.println("Люди в очереди: " + listActorsInQueue);
        }
    }


    public Market() {
        this.listActorsInMarket = new ArrayList<>();
        this.listActorsInQueue = new ArrayList<>();
        this.listActorsOutQueue = new HashSet<>();
        this.r = new Random();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        listActorsInMarket.add(actor);
    }

    public List<Actor> getListActorsOutQueue() {
        return new ArrayList<Actor>(listActorsOutQueue);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println("Выходят из магазина: " + actors);
        for (Actor actor : actors) {
            listActorsInMarket.remove(actor);
            listActorsInQueue.remove(actor);
            listActorsOutQueue.remove(actor);
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
        if (listActorsInMarket.contains(actor)) {
            listActorsInQueue.add(actor);
        } else {
            System.out.println("Человека нет в магазине");
        }
    }

    @Override
    public void takeOrders() {
        if (!listActorsInQueue.isEmpty()) {
            Actor actor = listActorsInQueue.get(r.nextInt(listActorsInQueue.size()));
            if (!actor.isMakeOrder) {
                actor.setMakeOrder();
                System.out.println(actor.name + " сделал заказ.");
            }
        } else {
            System.out.println("Никого нет в очереди для заказа");
        }
    }

    @Override
    public void giveOrders() {
        if (!listActorsInQueue.isEmpty()) {
            Actor actor = listActorsInQueue.get(r.nextInt(listActorsInQueue.size()));
            if (actor.isMakeOrder) {
                actor.setTakeOrder();
                System.out.println(actor.name + " получил заказ.");
            }
        } else {
            System.out.println("Никого нет в очереди на получение заказа");
        }
    }

    @Override
    public void releaseFromQueue() {
        if (!listActorsInQueue.isEmpty()) {
            Iterator<Actor> iterator = listActorsInQueue.iterator();
            while(iterator.hasNext()) {
                Actor actorToRemove = iterator.next();
                if (actorToRemove.isTakeOrder) {
                    System.out.println(actorToRemove.name + " вышел из очереди.");
                    listActorsOutQueue.add(actorToRemove);
                    iterator.remove();
                }

            }
        }
    }
}
