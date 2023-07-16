package Task1;

public class Cat {
    private String name;
    private int age;

    private Owner owner;

    public Cat() {
        name = "Барсик";
        age = 1;
        owner = new Owner();
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        owner = new Owner();
    }

    public Cat(String name, int age, String ownerName) {
        this(name, age);
        this.owner = new Owner(ownerName);
    }

    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", name, age, owner.getName());
    }

    public Owner getOwner() {
        return owner;
    }

    public void setNewOwner(String ownerName) {
        this.owner.setName(ownerName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
