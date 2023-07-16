package Task2;

import java.util.ArrayList;
import java.util.List;

public class MainT2 {
    public static void main(String[] args) {
//Реализовать класс Market и все его обязательные методы.
// Этот класс должен реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди.
// Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour,
// которые добавляют и удаляют людей из очереди, а также метод update,
// который обновляет состояние магазина путем принятия и отдачи заказов.

        Market market = new Market();
        Human human1 = new Human("Алексей");
        Human human2 = new Human("Василий");
        Human human3 = new Human("Дмитрий");

        Actor actor1 = new Human("Александр");
        Actor actor2 = new Human("Елена");
        Actor actor3 = new Human("Николай");


        Human human4 = new Human("Иван");
        Human human5 = new Human("Евгения");
        Actor actor4 = new Human("Максим");
        Actor actor5 = new Human("Ольга");

        List<Actor> listGroup = new ArrayList<>();
        listGroup.add(human4);
        listGroup.add(human5);
        listGroup.add(actor4);
        listGroup.add(actor5);

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.displayInMarket();
        System.out.println("------------------------");
        market.takeInQueue(human1);
        market.takeInQueue(human2);
        market.takeInQueue(actor1);
        market.displayInQueue();
        System.out.println("------------------------");
        for (int i = 0; i < 3; i++) {
            market.update();
        }
        System.out.println("------------------------");
        market.displayInMarket();
        market.displayInQueue();
        market.displayOutQueue();
        market.releaseFromMarket(market.getListActorsOutQueue());
        market.displayOutQueue();
        market.displayInMarket();
        System.out.println("------------------------");
        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        market.acceptToMarket(actor3);
        market.acceptToMarket(actor4);
        market.acceptToMarket(actor5);
        market.displayInMarket();
        System.out.println("------------------------");
        market.takeInQueue(actor1);
        market.takeInQueue(actor2);
        market.takeInQueue(actor3);
        market.takeInQueue(actor4);
        market.takeInQueue(actor5);
        market.displayInQueue();
        System.out.println("------------------------");
        for (int i = 0; i < 7; i++) {
            market.update();
        }
    }
}
