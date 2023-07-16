package Task1;

public class ForestCat implements ForestCatInterface, CanRunningInterface{
    private String name;
    private int age;

    private String habitat;

    public ForestCat() {
        name = DEFAULT_NAME;
        age = DEFAULT_AGE;
        habitat = DEFAULT_HABITAT;
    }

    @Override
    public void run() {
        System.out.printf("Я бегаю по \'%s\'!\n", getHabitat());
    }

    public ForestCat(String name, int age) {
        this.name = name;
        this.age = age;
        habitat = DEFAULT_HABITAT;
    }

    public ForestCat(String name, int age, String habitat) {
        this(name, age);
        this.habitat = habitat;
    }

    @Override
    public void displayHabitat() {
        System.out.printf("Шшшш! Моя среда обитания - %s.\n", habitat);
    }

    @Override
    public void greet() {
        System.out.printf("Шшшш! Меня зовут %s. Мне %d года(лет). Среда обитания - %s.\n", name, age, habitat);
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
