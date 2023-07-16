package Task2;

public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    protected String name;

    abstract String getName();

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return 8 * name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Actor actor)) return false;

        return this.name.equals(actor.name);
    }
}
