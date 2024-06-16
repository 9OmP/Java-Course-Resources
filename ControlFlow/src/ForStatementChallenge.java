public class ForStatementChallenge {

    public static int counter = 0;
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 2) {
                return false;
            }
        }
        counter++;
        return true;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++){
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number and count is " + counter);
        }
    }
}
