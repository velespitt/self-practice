package day12_practice_tasks_inheritance;

public class Samsung extends Phone{
    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void developMode(){
        System.out.println("Opened developer settings");
    }
}
