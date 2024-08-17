package dev.om;

import java.util.Arrays;

public class Reverse_Array_Challenge {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        int len = arr1.length % 2 == 0 ? (arr1.length / 2) : ((arr.length + 1) / 2);
        for(int i = 0; i < len; i++){
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr[arr1.length - 1 - i] = temp;
        }
        System.out.print("Array = " + Arrays.toString(arr));
        System.out.print("Reversed array = " + Arrays.toString(arr));

    }



}
