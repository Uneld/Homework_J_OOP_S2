package Task1;

public class Cat implements CatInterface, Ownerable, CanRunningInterface{
    private String name;
    private int age;

    private Owner owner;

    public Cat() {
        name = OwnerCat.DEFAULT_NAME;
        age = DEFAULT_AGE;
        owner = new Owner();
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        owner = new Owner();
    }

    @Override
    public void run() {
        System.out.println("Я бегаю по дому! Тыг-дык, тыг-дык!");
    }

    public Cat(String name, int age, String ownerName) {
        this(name, age);
        this.owner = new Owner(ownerName);
    }

    @Override
    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", name, age, owner.getName());
    }

    public Owner getOwner() {
        return owner;
    }

    public void setNewOwner(String ownerName) {
        this.owner.setName(ownerName);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
