public class Car_1 {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car_1(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return  ("Car -> startEngine()");
    }

    public String accelerate(){
        return ("Car -> accelerate()");
    }

    public String brake(){
        return ("Car -> brake()");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
