public class Hybrid_Car extends Car {

    private double avgKmPerLitre;
    private double avgKmPerCharge;
    private int batterySize = 4;
    private int cylinders = 6;

    public Hybrid_Car(String description, double avgKmPerLitre, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> All %d cylinders are fired up. %n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on , Ready!%n", batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerLitre);
        System.out.printf("Hybrid -> usage under the avg: %.2f %n", avgKmPerCharge);
    }
}
