public class WhileLoopChallenge {
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int init = 5, end = 20, counter = 0;
        int start = init;
        while (start <=end){
            if (counter >= 5){
                break;
            }
            if (isEvenNumber(start)){
                counter += 1;
                System.out.println(start);
            }
            start++;
        }
        int total = end - start ;
        System.out.println("There were " + counter + " even, and " + total + "odd numbers.");
    }
}
