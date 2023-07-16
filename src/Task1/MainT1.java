package Task1;

public class MainT1 {
    public static void main(String[] args) {
//Задача 1:
//Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
//- интерфейсы,
//- константы,
//- default методы,
//- перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
// Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Маркиз", 4);
        Cat cat3 = new Cat("Персик", 8, "Дмитрий");

        cat1.greet();

        cat2.greet();
        cat3.greet();

        cat2.setAge(5);
        cat2.setNewOwner("Василий");
        cat2.greet();
        cat2.run();
        System.out.println("-------------------");

        OwnerCat.sayHello();
        System.out.println("-------------------");

        ForestCat fcat = new ForestCat("Манул", 15, "пустыня Южной Африки");
        fcat.displayHabitat();
        fcat.greet();
        fcat.run();
    }
}