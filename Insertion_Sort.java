//Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.

public class Solution {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        for(int i = 0; i<arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
