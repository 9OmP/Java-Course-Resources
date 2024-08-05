public class Mitsubishi extends Car_1 {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
         return ("Mitsubishi -> startEngine()");
    }

    @Override
    public String accelerate() {
         return ("Mitsubishi -> accelerate()");
    }

    @Override
    public String brake() {
        return ("Mitsubishi -> brake()");
    }
}
