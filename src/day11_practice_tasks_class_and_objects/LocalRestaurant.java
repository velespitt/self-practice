package day11_practice_tasks_class_and_objects;

import java.util.ArrayList;
import java.util.Arrays;

class Chef {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    public void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{name='" + name + '\'' + ", employeeID=" + employeeID + ", hourlyRate=" + hourlyRate + ", fullTime=" + (fullTime ? "Full-Time" : "Part-Time") + '}';
    }
}

class Server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    @Override
    public String toString() {
        return "Server{name='" + name + '\'' + ", employeeID=" + employeeID + ", hourlyRate=" + hourlyRate + ", fullTime=" + (fullTime ? "Full-Time" : "Part-Time") + '}';
    }
}

class Restaurant {
    String owner;
    String location;
    int numberOfStars;
    ArrayList<Server> servers;
    ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.servers = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(chef -> chef.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(server -> server.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}

public class LocalRestaurant {
    public static void main(String[] args) {
        // Create Restaurant object
        Restaurant restaurant = new Restaurant("John Doe", "123 Main Street", 5);

        // Create Servers
        Server server1 = new Server("Alice", 101, 15.50, true);
        Server server2 = new Server("Bob", 102, 14.00, false);
        Server server3 = new Server("Charlie", 103, 13.75, true);
        Server server4 = new Server("Charlie", 103, 13.75, true);

        // Create Chefs
        Chef chef1 = new Chef("David", 201, 20.00, true);
        Chef chef2 = new Chef("Eve", 202, 22.50, false);

        // Add Servers and Chefs to Restaurant
        restaurant.hireServer(new Server[]{server1, server2, server3,server4});
        restaurant.hireChef(new Chef[]{chef1, chef2});

        // Print Restaurant Info
        System.out.println(restaurant);

        // Print details of Servers and Chefs
        System.out.println("\nServers:");
        for (Server server : restaurant.servers) {
            System.out.println(server);
        }

        System.out.println("\nChefs:");
        for (Chef chef : restaurant.chefs) {
            System.out.println(chef);
        }
    }
}

