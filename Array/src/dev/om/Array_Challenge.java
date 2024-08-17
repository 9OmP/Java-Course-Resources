package dev.om;

import java.util.Arrays;
import java.util.Random;

public class Array_Challenge {

    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = array.length - 1; i >= 0; i--){
            array[i] = random.nextInt(101);
        }
        Arrays.sort(array);
        int[] rev = new int[array.length];
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length ; i++){
            int temp = array.length - i - 1;
            rev[temp] = array[i];
        }
        System.out.println(Arrays.toString(rev));
    }


}
