package com.dsa.leetcode.arrays;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

/*
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */
public class L2011FinalValAfterOperation {
    public static void main(String[] args) {
        String [] arr={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }
    static int finalValueAfterOperations(String[] operations){
        int x=0;
        for (int i=0;i<operations.length;i++){
            if (operations[i].startsWith("-")){
                --x;
            }
            else if (operations[i].startsWith("+")){
                x++;
            }
            else if (operations[i].endsWith("+")){
                x++;
            }
            else if (operations[i].endsWith("-")){
                x--;
            }
        }
        return x;
    }

    static int finalValueAfterOperationsV2(String[] operations){
        int x=0;
        for (String operation:operations){
            switch (operation.toUpperCase()){
                case "X++":
                    x++;
                    break;
                case "X--":
                    x--;
                    break;
                case "++X":
                    ++x;
                    break;
                case "--X":
                    --x;
                    break;
                default:
                    System.out.println("Give valid operation");
            }
        }
        return x;
    }
}
