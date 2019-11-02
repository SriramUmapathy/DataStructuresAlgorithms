package com.ds.problem.Array;

import java.util.ArrayList;

public class HotelBookingsPossible {


    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

        int i = 0;
        while(i < arrive.size() - 1 ) {
            int start = arrive.get(i), end = depart.get(i);
            int count = K;

            for(int j =0; j < arrive.size(); j++) {

                if(j == i)
                    continue;

                int start1= arrive.get(j), end1 = depart.get(j);

                if((start1 > start && start1 < end) || (end1 > start && end1 < end) ){
                    count --;
                    if(count <= 0)
                        return false;
                }

            }
            i++;
        }

        return true;
    }

    public static ArrayList<Integer> getArray( int[] a ){
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i =0; i < a.length; i++) {
            list1.add(a[i]);
        }

        return list1;
    }


    public static void main(String[] args) {

        int[] a = { 13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25, 48, 49, 12, 7, 8 };

        int[] b = {28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76, 60, 90, 67, 22, 51, 53};

        ArrayList<Integer> list1 = getArray(a);
        ArrayList<Integer> list2 = getArray(b);

        int K = 23;

        System.out.println(new HotelBookingsPossible().hotel(list1,list2,K));
    }
}
