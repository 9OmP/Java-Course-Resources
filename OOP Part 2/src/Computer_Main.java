public class Computer_Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, "v2.44", 6);

        Personal_Computer thePc = new Personal_Computer("2208", "dell", theMonitor, theMotherboard, theCase);

//        thePc.getMonitor().drawPixelAt(10, 10, "Blue");
//        thePc.getMotherboard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }
}