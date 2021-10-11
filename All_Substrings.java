//For a given input string(str), write a function to print all the possible substrings.

public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int s = str.length();
        
        for(int i = 0; i<s; i++){
            for(int j = i+1; j<=s; j++){
                System.out.println(str.substring(i,j));
            }
            
        }
	}

}
