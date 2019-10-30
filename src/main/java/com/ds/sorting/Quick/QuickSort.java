package com.ds.sorting.Quick;

public class QuickSort {

    private static int pivot(int[] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;
        int j = start;

        while(j < end) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            j++;
        }

        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i+1;
    }

    private static int[] sort(int[] array, int start, int end){

        if(start < end) {
            int pivot = pivot(array,start,end);
            System.out.println(pivot);
            sort(array,start,pivot - 1);
            sort(array,pivot + 1,end);
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
        sort(array,0,array.length - 1);
        printSortedArray(array);
    }
}
