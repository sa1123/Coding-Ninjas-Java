// You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int z = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                z++;
            }
        }
        for(int i = 0; i<z; i++){
            arr[i] = 0;
        }
        for(int i = z; i<arr.length; i++){
            arr[i] = 1;
        }
            
    }
}