// You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
//  You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
// 'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.

public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}