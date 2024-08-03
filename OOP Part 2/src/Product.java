public class Product {

    private String model;
    private String manafacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manafacturer) {
        this.model = model;
        this.manafacturer = manafacturer;
    }
}

class Monitor extends Product{

    private int size;
    private String resolution;


    public Monitor(String model, String manafacturer) {
        super(model, manafacturer);
    }

    public Monitor(String model, String manafacturer, int size, String resolution){
        super(model, manafacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s.", x, y, color));
    }
}

class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manafacturer) {
        super(model, manafacturer);
    }

    public Motherboard(String model, String manafacturer, int ramSlots, String bios, int cardSlots) {
        super(model, manafacturer);
        this.ramSlots = ramSlots;
        this.bios = bios;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manafacturer) {
        super(model, manafacturer);
    }

    public ComputerCase(String model, String manafacturer, String powerSupply) {
        super(model, manafacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}