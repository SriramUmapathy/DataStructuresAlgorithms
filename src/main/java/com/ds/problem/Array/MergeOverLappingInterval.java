package com.ds.problem.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverLappingInterval {
    static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }

    private ArrayList<Interval> sort(ArrayList<Interval> array) {

        for (int i = 0; i < array.size(); i++) {
            boolean flag = true;

            for(int j = 0; j < array.size() - i -1; j++) {

                if(array.get(j).start > array.get(j+1).start) {
                    Interval temp = array.get(j);
                    array.set(j,array.get(j+1));

                    array.set(j+1,temp);
                    flag = false;
                }

            }
            if(flag)
                break;
        }
        return array;
    }




    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
//        intervals = new MergeOverLappingInterval().sort(intervals);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });


        ArrayList<Interval> list = new ArrayList<>();
        int i = 0;

        while(i < intervals.size()){

            Interval interval = intervals.get(i);

            while(i < intervals.size() - 1 && interval.end >= intervals.get(i+1).start ){
                interval.end = Math.max(intervals.get(i+1).end, interval.end);
                i++;
            }

            list.add(interval);
            i++;
        }
        return list;
    }

    public static void printSortedArray(ArrayList<Interval> sortedArray){
        for(int i = 0; i < sortedArray.size(); i++){
//            System.out.println(sortedArray.get(i).start +" "+sortedArray.get(i).end+" ");
        }
//        System.out.println();
    }
    public static void main(String[] args) {

        ArrayList<Interval> list = new ArrayList<>();
        Interval interval = new Interval(1,3);

        interval = new Interval(1,10);
        list.add(interval);
        interval = new Interval(2,9);
        list.add(interval);
        interval = new Interval(3,8);
        list.add(interval);
        interval = new Interval(4,7);
        list.add(interval);
        interval = new Interval(5,6);
        list.add(interval);
        interval = new Interval(6,6);
        list.add(interval);


        printSortedArray(new MergeOverLappingInterval().merge(list));


    }
}
