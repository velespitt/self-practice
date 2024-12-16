package day12_practice_tasks_encapsulation;

public class CircleClient {

    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        System.out.println(circle);//toString working fine

        circle.setRadius(8.9);//setRadius working fine
        System.out.println(circle.getRadius());//getRadius working fine
        System.out.println(circle.calcArea());//setRadius working fine
        System.out.println(circle.calcPerimeter());//calcPerimeter working fine

        Circle circle1 = new Circle(-2);
        System.out.println(circle1);
    }
}
