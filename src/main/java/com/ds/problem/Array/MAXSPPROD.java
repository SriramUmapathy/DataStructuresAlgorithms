package com.ds.problem.Array;

import java.util.ArrayList;

public class MAXSPPROD {

    public int maxSpecialProduct(ArrayList<Integer> A) {


        int leftSpecialValue = 0;
        int rightSpecialValue = 0;
        int max = 0;
        int currentProduct = 0;

        for(int i = 0; i < A.size(); i++) {

            int j = i - 1;

            while(j >= 0) {
                if(A.get(j) > A.get(i) || j == 0){
                    leftSpecialValue = j;
                    break;
                }
                j--;
            }

            for(int k=i+1;k<A.size();k++){
                if(leftSpecialValue == 0) {
                    break;
                }
                if(A.get(k) > A.get(i)) {
                    rightSpecialValue = k;
                    break;
                }
            }
            currentProduct = leftSpecialValue * rightSpecialValue;
            if(currentProduct > max) {
                max = currentProduct;
            }
            leftSpecialValue = 0;
            rightSpecialValue = 0;

        }
        return max % 1000000007;





//        int count = 0;
//        for (int i = 1; i < A.size() - 1; i++) {
//            int j = i - 1, k = i + 1;
//            while(j >= 0) {
//                if(A.get(j) > A.get(i) || j == 0)
//                    break;
//                j--;
//            }
//            while(k < A.size()) {
//                if(A.get(k) > A.get(i) || k == A.size() - 1)
//                    break;
//                k++;
//            }
//            if(A.get(j) > A.get(i) && A.get(k) > A.get(i)) {
//                int value = j * k;
//                count = Math.max(count,value);
//            }
//        }
//        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> inner = new ArrayList<>();
        inner.add(4);//0
        inner.add(2);//1
        inner.add(3);//2
        inner.add(1);//3
        inner.add(2);//4
        inner.add(3);//5

        System.out.println(new MAXSPPROD().maxSpecialProduct(inner));
    }
}
