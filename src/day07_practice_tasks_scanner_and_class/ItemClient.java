package day07_practice_tasks_scanner_and_class;

public class ItemClient {
    public static void main(String[] args) {
        Item item = new Item();

        item.itemName = "Apple";
        item.quantity = 5;
        item.unitPrice = 1500;

        item.calcCost();
        System.out.println(item);

    }




}
