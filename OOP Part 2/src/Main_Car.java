public class Main_Car {
    public static void main(String[] args) {
        Car car1 = new Car("");
        Car car2 = new Gas_Powered_Car("", 23.34, 4);
        Car car3 = new Electric_Car("", 200, 7);
        Car car4 = new Hybrid_Car("", 24, 165, 6, 3);
        runRace(car1);
        runRace(car2);
        runRace(car3);
        runRace(car4);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println("-------------------------------");
    }
}
