package day12_practice_tasks_encapsulation;

public class CandyClient {
    public static void main(String[] args) {
        Candy candy = new Candy("Eti", 1, 5, false);

        System.out.println(candy);

        Candy freeCandy = new Candy("Ulker", 3, 0, true);

        System.out.println(freeCandy);

        freeCandy.setPrice(15);
        System.out.println(freeCandy);

        freeCandy.setQuantity(20);
        System.out.println(freeCandy);

        System.out.println(candy.getBrand());
        System.out.println(candy.isHasPeanuts());

    }
}
