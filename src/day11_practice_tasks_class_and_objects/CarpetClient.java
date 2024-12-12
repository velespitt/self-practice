package day11_practice_tasks_class_and_objects;

public class CarpetClient {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(15.2, 30.5, 10, true);

        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(15.2, 30.5, 10, false);

        System.out.println(carpet2);
    }
}
