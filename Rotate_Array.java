//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int[] temp = new int[d];
        
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        
        int j = 0;
        
        for(int i = d; i<arr.length; i++){
            arr[j] = arr[i];
            j++;
        }
        
        j = 0;
        
        for(int i = arr.length - d; i<arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
    }

}
