public class Car {

    private String model = "Tesla";
    private String make = "X";
    private String color = "White";
    private int doors = 2;
    private boolean convertible = true;

    public void getDescription(){
        System.out.println(getDoors() +" doors, " +
                getColor() + ", " +
                getMake() + ", " +
                getModel() + ", " +
                isConvertible() + "."
                );
    }

    public String getMake() {
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors() {
        return doors;
    }
    public boolean isConvertible(){
        return convertible;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String setMake(String make) {
        if (make == null) make = "Unknown";
        String makeLower = make.toLowerCase();
        switch (makeLower){
            case "porshe", "tesla", "tata" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
        return make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
