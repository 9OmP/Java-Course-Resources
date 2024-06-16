import java.util.Scanner;

public class ReadingChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        do{
            System.out.println("Enter number #" + counter);
            String nextNumber = sc.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }while(counter <= 5);

        System.out.println("The sum of the numbers is"+ sum);
    }
}
