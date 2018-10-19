package com.manoj.bubbleSort;

import com.manoj.utils.Utils;

import java.util.Arrays;

public class BubbleSortRecurssion {

    void bubbleSort(int [] a,int i){

        if(i==a.length-1){
            return;
        }else{

            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    Utils.swap(j,j+1,a);
                }
            }
            bubbleSort(a,i+1);
        }
    }

    public static void main(String[] args) {
        {
            BubbleSortRecurssion sort = new BubbleSortRecurssion();
            int [] sortingArray = {5,2,1,8,9,6};
            System.out.println("Before sorting recurssion");
            Arrays.stream(sortingArray).forEach(System.out::print);
            sort.bubbleSort(sortingArray,0);
            Arrays.stream(sortingArray).forEach(System.out::print);
        }
    }
}
