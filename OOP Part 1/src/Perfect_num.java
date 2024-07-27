import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int sum = 0;

        for(int i = 1; i < b ; i++){
            if (a % i == 0){
                sum += i;
            }
        }

        if (sum == b){
            System.out.println("Sum of Divisors: "+ sum);
            System.out.println(b + " is a Perfect Number");
        } else {
            System.out.println("Sum of Divisors: "+ sum);
            System.out.println(b + " is not a Perfect Number");
        }

    }
}
