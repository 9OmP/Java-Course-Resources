package dev.om;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[5] = (int) 50.2;

        double[] myArray2 = new double[10];
        myArray2[2] = 23.24;

        int[] firstTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstTen1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Length of firstTen1: "+ firstTen1.length);
        System.out.println(myArray[5] + myArray2[2] + firstTen[9] + firstTen1[9]);
        System.out.println("Last element: " + firstTen1[firstTen.length - 1]);

        int[] newArray;
//        newArray = new int[]{1, 2, 3};
        newArray = new int[5];

        int n = 5;
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = n--;
        }
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println(Arrays.toString(newArray));

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");

        for(Object i : objectArray){
            if (i !=  null){
                System.out.println(i.toString());
            } else {
                System.out.println("null object");
            }
        }
    }
}