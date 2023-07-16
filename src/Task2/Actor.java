package Task2;

public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    protected String name;

    abstract String getName();
}
