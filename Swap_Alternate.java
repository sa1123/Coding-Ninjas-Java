// You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        for(int i = 1; i < arr.length; i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
}
