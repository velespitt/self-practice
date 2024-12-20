package day12_practice_tasks_inheritance;

public class iPhone extends Phone{

    //Constructor, attributes, encapsulation hepsini getiriyor bu.
    public iPhone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

//    public iPhone(){
//        super("iPhone","15 Pro","12 inches",3000,"Blue");
//
//    }
//
//    public void call(long phoneNumber) {
//        super.call(phoneNumber);
//    }
//
//    public void text(long phoneNumber) {
//        super.text(phoneNumber);
//    }

    public void faceTime(long phoneNumber){
        System.out.println("Facetiming with the number " + phoneNumber);
    }


}
