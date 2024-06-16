public class SumDigits {
    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }
        if (number % 10 == 0){
            return number;
        }
        int sum = 0;
        while (number > 0){
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = -123;
        System.out.println("Sum of " + number + " is " + sumDigits(number));
    }
}
