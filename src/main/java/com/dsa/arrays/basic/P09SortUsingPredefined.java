package com.dsa.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P09SortUsingPredefined {
    public static void main(String[] args) {
        Integer[] arr = {3, 32, 33, 21, 11, 2, 66, 22};
        Arrays.sort(arr);
        System.out.println("Sorting in Asc"+Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder()); // not applicable for primitive type
        // if u want use only primitive then while printing, print in reverse using for loop
        System.out.println("Sorting in Desc "+Arrays.toString(arr));

        Arrays.sort(arr,0,4);
        System.out.println("Sorting till 4 index "+Arrays.toString(arr));//exclude 4th index


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(3);
        arrayList.add(32);
        arrayList.add(33);
        arrayList.add(21);
        arrayList.add(11);
        arrayList.add(2);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);


    }
}
