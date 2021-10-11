//Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.

public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }   

}