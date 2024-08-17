package dev.om;

import java.util.Arrays;

public class Multiple_Arrays {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(Arrays.toString(arr));

//        for(int[] arr1 : arr){
//            System.out.println(Arrays.toString(arr1));
//        }

        for(int i = 0; i < arr.length; i++){
            var innerArray = arr[i];
            for(int j= 0; j < innerArray.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
