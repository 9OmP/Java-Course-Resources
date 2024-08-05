public class Electric_Car extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public Electric_Car(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery On, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the avg: %.2f %n", avgKmPerCharge);
    }
}
