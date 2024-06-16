public class Main {
    public static void main(String[] args) {

        double v1 = 20.0d;
        double v2 = 80.0d;
        double ans = ((v1 + v2) * 100.00d )% 40.00d;
        boolean NoRemainder = (ans == 0) ? true : false;

        if(!NoRemainder) {
            System.out.print("Got some Remainder.");
        }


    }
}