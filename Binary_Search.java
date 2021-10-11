//You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.

public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int e = arr.length-1;
        int s = 0;
        int m = (s+e)/2;
        
        while(s<=e){
            if(x < arr[m]){
                e = m-1;
                //System.out.println("s " + s + " e " + e);
            }
            else{
                s = m+1;
                //System.out.println("s " + s + " e " + e);
            }
        	m = (s+e)/2;
            if(arr[m] == x){return m;}
        }
        return -1;
    }
}
