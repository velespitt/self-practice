package day12_practice_tasks_inheritance;

public class Nokia extends Phone{

    //bu sekilde de yapabiliyoruz brandi clientta girmek yerine burada girmek gibi.
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
}
