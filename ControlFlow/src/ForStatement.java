public class ForStatement {

    public static void calculateInterest(double interest){
        System.out.println(interest * (100+interest));
    }

    public static void main(String[] args) {


        for(double counter= 7.5; counter<=10; counter += 0.25){
            calculateInterest(counter);
        }

    }
}

