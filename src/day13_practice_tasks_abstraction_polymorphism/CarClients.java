package day13_practice_tasks_abstraction_polymorphism;

public class CarClients {

    public static void main(String[] args) {

        Car car = new Car(2025, "Hyundai", "C-HR", 40_000, "Grey") {

            @Override
            public void start() {
                System.out.println(getMake() + " is started.");
            }

            @Override
            public void drive() {
                System.out.println(getMake() + " is driving");
            }


        };
        System.out.println(car);

        car.start();
        car.drive();

        AutoPark autoPark = new CydeoCar(2025,"Fly",50_000,"Red");
        System.out.println(autoPark);

        Toyota toyota = new Toyota(2024,"C-HR",45_000,"Black");
        System.out.println(toyota);

        Honda honda = new Honda(1900,"Civic",30_000,"White");
        System.out.println(honda);
        honda.stop();
        honda.start();
        honda.drive();

        CydeoCar cydeoCar = new CydeoCar(2030,"Tron",70_000,"Void");
        System.out.println(cydeoCar);
        cydeoCar.fly();
        cydeoCar.selfDrive();
        cydeoCar.autoPark();
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.stop();
        cydeoCar.setColor("Blue");
        System.out.println(cydeoCar);

        Tesla tesla = new Tesla(2025,"ION",60_000,"Yellow");
        System.out.println(tesla);
        tesla.autoPark();

    }
}
