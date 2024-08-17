package dev.om;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Element_Challenge {

    public static void main(String[] args) {
        String[] my_array = readIntegers();
        System.out.println(Arrays.toString(my_array));
        int min = findMin(my_array);
        System.out.println(min);
    }

    public static String[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str.split(",");
    }

    public static int findMin(String[] array){
        int min = Integer.MAX_VALUE;
        for(String s : array){
            if (Integer.parseInt(s.trim()) < min){
                min = Integer.parseInt(s.trim());
            }
        }
        return min;
    }
}
