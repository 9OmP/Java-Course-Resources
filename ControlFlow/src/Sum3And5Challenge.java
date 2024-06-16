public class Sum3And5Challenge {
    public static void main(String[] args) {
        int counter= 0, sum =0;
        for(int i = 1; i <= 1000; i++){
            if (counter == 5){
                break;
            }
            if (i % 3 == 0 && i % 5 == 0){
                counter++;
                sum+= i;
                System.out.println("New Number is " + i);
            }
        }
        System.out.println("Sum is " + sum);
    }
}
