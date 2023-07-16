package Task2;

public class Human extends Actor{
    public Human(String name) {
        super.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        isMakeOrder = false;
    }

    @Override
    public void setMakeOrder() {
        isTakeOrder = false;
        isMakeOrder = true;
    }
}
