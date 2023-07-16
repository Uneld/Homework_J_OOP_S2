package Task1;

public interface CatInterface {
    String DEFAULT_NAME = "Барсик";
    int DEFAULT_AGE = 1;

    default void greet(){
        System.out.println("Мяу! Я кот");
    }

    int getAge();

    String getName();
}
