package Task1;

public class Owner {
    private String name;

    public Owner() {
        this.name = "Отсутсвует";
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
