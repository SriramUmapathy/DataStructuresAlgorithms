package com.ds.sorting.bubble;

public class BubbleSort {

    private static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            System.out.println(i);
            for(int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
        return array;
    }

    public static void printSortedArray(int[] sortedArray) {
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        sort(array);
        printSortedArray(array);
    }
}
