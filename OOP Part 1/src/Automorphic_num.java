import java.util.Scanner;

public class Automorphic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String a_str = Integer.toString(a);
        int len = a_str.length();

        int squared = a * a;
        String sq_str = Integer.toString(squared);
        int len_sq = sq_str.length();

        len = len_sq - len;

        System.out.println("Given num: " + a);
        System.out.println("Squared num: "+ squared);
        System.out.println("Found this in end places: " + sq_str.substring(len));
        if (a_str.equals(sq_str.substring(len))){
            System.out.println(a + " is a Automorphic Number");
        } else{
            System.out.println(a + " is not a Automorphic Number");
        }
    }
}
