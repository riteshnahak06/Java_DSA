package com.dsa.arrays.matrix;

import java.util.Arrays;
import java.util.Scanner;
public class P01InitializeAndPrint2DArray {
    public static void main(String[] args) {

        // initialize array
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter row size ");
        int rowSize=sc.nextInt();
        System.out.println("Enter col size ");
        int colSize=sc.nextInt();
        int [][] arr=new int[rowSize][colSize];

        System.out.println("Enter values ");
        for (int row=0; row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        for (int row=0; row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // Other way to print
        for (int row=0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}
