public class MethodOverloading {
    public static double convertToCentimeters(int inches){
        //1 inch = 2.54cm
            return inches * 2.54d;
    }

    public static double convertToCentimeters(int feets, int inches){
        double total = inches * 2.54d;
        total = total + feets * 2.54d * 12;
        return total;
    }

    public static void main(String[] args) {
        double x = convertToCentimeters(133);
        double y = convertToCentimeters(6, 0);
        System.out.println("For 133 inches, it is "+ x + " cms");
        System.out.println("For 12 feet 3 inches, it is "+ y + " cms");
    }

}
