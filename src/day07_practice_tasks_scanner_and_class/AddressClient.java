package day07_practice_tasks_scanner_and_class;

public class AddressClient {

    public static void main(String[] args) {

        Address address = new Address();

        address.state = "Va";
        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.zipCode = "22012";

        System.out.println(address);
        System.out.println();
    }
}
