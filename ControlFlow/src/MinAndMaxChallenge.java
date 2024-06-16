import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0, min = 0, counter = 1;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter a number: ");
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (counter == 1 || num < min) {
                    max = num;
                    min = num;
                }
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
                counter++;
            } catch (NumberFormatException nfe) {
                flag = false;
                System.out.println("Max = " + max + " and Min = " + min);
            }
        }

    }
}
