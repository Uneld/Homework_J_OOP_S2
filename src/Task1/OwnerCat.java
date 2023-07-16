package Task1;

public interface OwnerCat {
    String DEFAULT_NAME = "Отсутсвует";
    String getName();
    static void sayHello(){
        System.out.println("Всем привет!!");
    }
}
