package com.ds.sorting.insertion;

public class InsertionSort {

    public static int[] sort(int[] array){

        for(int i = 1; i < array.length; i++){

            int value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > value) {

                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = value;
        }

        return array;
    }

    public static void printSortedArray(int[] sortedArray){
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] +" ");
        }
    }

    public static void main(String[] args) {

        int[] input = {6,3,9,4,8,2};
        input = sort(input);
        printSortedArray(input);
    }
}
