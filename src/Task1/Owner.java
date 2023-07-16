package Task1;

public class Owner implements OwnerCat {
    private String name;

    public Owner() {
        this.name = DEFAULT_NAME;
    }

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
