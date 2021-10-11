// You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        if(arr1.length>=arr2.length){
            for(int i = 0; i<len1; i++){
                for(int j = 0; j<len2; j++){
                    if(arr1[i] == arr2[j]){
                        System.out.print(arr1[i] + " ");
                        arr2[j] = Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
        else{
            for(int i = 0; i<len2; i++){
                for(int j = 0; j<len1; j++){
                    if(arr2[i] == arr1[j]){
                        System.out.print(arr2[i] + " ");
                        arr1[j] = Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
        
        return;
    }
}