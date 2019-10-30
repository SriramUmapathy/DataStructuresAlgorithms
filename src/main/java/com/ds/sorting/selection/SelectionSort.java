package com.ds.sorting.selection;

public class SelectionSort {

    private static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;

            for (int j = i+1; j < array.length; j++) {

                if(array[j] < array[min]){
                    min = j;
                }

            }

            if(i != min) {

                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }

        return array;
    }

    public static void printSortedArray(int[] sortedArray){
        for(int i = 0; i < sortedArray.length; i++){
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
