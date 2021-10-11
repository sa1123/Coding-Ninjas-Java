//Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.

public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                // for(int k = 0; k<arr.length; k++){
                //     System.out.print(arr[k] + " ");
                // }
                // System.out.println();
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
    }  
}