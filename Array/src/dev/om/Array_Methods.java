package dev.om;

import java.util.Arrays;
import java.util.Random;

public class Array_Methods {

    public static void main(String[] args) {
        int[] array = getRandomArray(5);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] sec_array = new int[10];
        System.out.println(Arrays.toString(sec_array));
        Arrays.fill(sec_array, 5);
        System.out.println(Arrays.toString(sec_array));

        String[] third_array = new String[]{"sd", "sdscs", "adc", "ves"};
        Arrays.sort(third_array);
        System.out.println(Arrays.toString(third_array));
        if (Arrays.binarySearch(third_array, "sd") >= 0){
            System.out.println("Found Match for \"sd\" ");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("s1 and s2 are equal");
        }

    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < newInt.length; i++){
            newInt[i] = random.nextInt(101);
        }
        return newInt;
    }
}


