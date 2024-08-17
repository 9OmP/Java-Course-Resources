import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement{

    public static void main(String[] args) {
        int len = readInteger();
        int[] array = readElements(len);
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        System.out.println(min);

    }

    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int[] readElements(int len){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = Integer.parseInt(str[i].trim());
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i : array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
}
