// For a given input string(str), find and return the total number of words present in it.
// It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
        int count = 0;
        
        if(str.length() == 0){return 0;}
        
        String[] ans = str.split(" ");
        return ans.length;
	}

}