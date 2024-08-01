import java.util.Scanner;

public class Decimal_To_Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

        while (n != 0){
            int i = 0;
            if (n - Math.pow(2, i) >= 0){
                str = "1" + str;
                n -= (int) Math.pow(2, i);
            } else{
                str = "0" + str;
                n -= (int) Math.pow(2, i);
            }
            System.out.println(str);
            i++;
        }

    }

}
