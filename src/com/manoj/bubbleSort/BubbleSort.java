package com.manoj.bubbleSort;

import com.manoj.utils.Utils;

import java.util.Arrays;

public class BubbleSort {

    void bubbleSorting(int [] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    Utils.swap(j,j+1,a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int [] sortingArray = {5,2,1,8,9,6};
        System.out.println("Before sorting");
        Arrays.stream(sortingArray).forEach(System.out::print);
        sort.bubbleSorting(sortingArray);
        System.out.println("After sorting");
        Arrays.stream(sortingArray).forEach(System.out::print);
    }
}
