public class Strong_number {
    public static void main(String[] args) {
        int a = 40585;
        int r, sum = 0;

        while(a > 0){
            r = a % 10;
            a /= 10;
//            System.out.println("r is: " + r);
            sum += fact(r);
//            System.out.println("Current sum: " + sum);
        }
        System.out.println("Final Sum: " + sum);
        a = 40585;
        if (sum == a){
            System.out.println("Number is Strong Number");
        }else {
            System.out.println("Number is not a Strong Number");
        }
    }

    private static int fact(int r) {
        int fact = 1;
        for( int i = 1; i <= r ; i++){
            fact *= i;
        }
        return fact;
    }
}
