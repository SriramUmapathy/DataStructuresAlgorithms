package com.ds.sorting.merge;

public class MergeSort {


    private static int[] mergeSort(int[] array,int startIndex, int mid, int endIndex) {

        int[] temp = new int[endIndex - startIndex + 1];

        int i = startIndex, j = mid + 1, k = 0;

        while (i <= mid && j <= endIndex) {

            if(array[i] <= array[j]) {

                temp[k] = array[i];
                i++;

            } else {

                temp[k] = array[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= endIndex) {
            temp[k] = array[j];
            j++;
            k++;
        }

        for(i = startIndex, k = 0; i <= endIndex; i++, k++){
            array[i] = temp[k];
        }

        return array;
    }


    private static int[] mergeSort(int[] array,int startIndex, int endIndex) {

//        System.out.println(startIndex +" :: "+endIndex);

        if(startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, midIndex);
            mergeSort(array, midIndex + 1, endIndex);
            mergeSort(array, startIndex, midIndex, endIndex);
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

        int[] input = {4,7,8,2,9,5,1,0,6,3};
        printSortedArray(input);
        mergeSort(input,0,input.length-1);
        printSortedArray(input);
    }

}
