package day13_practice_tasks_abstraction_polymorphism;

public interface AndroidApps extends Downloadable{

    String APP_STORE_NAME = "Google Play Store";
    String OS = "16 Baklava";

}
interface AppleApps extends Downloadable{
    String APP_STORE_NAME = "AppStore";
    String OS = "17";
}
