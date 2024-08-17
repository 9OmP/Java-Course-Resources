import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {


    public static int[] getIntegers(int len){
        int[] array = new int[len];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + len + " integer values:\r");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];                     // 1
                    sortedArray[i] = sortedArray[i+1];         // 2
                    sortedArray[i+1] = temp;                   // 3
                    flag = true;                               // 4
                }
            }
        }
        return sortedArray;
    }

}
