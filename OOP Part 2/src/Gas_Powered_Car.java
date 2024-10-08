public class Gas_Powered_Car extends Car {

    private double avgKmPerLitre;
    private int cylinders = 4;

    public Gas_Powered_Car(String description) {
        super(description);
    }

    public Gas_Powered_Car(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
