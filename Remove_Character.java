// For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
// The input string will remain unchanged if the given character(X) doesn't exist in the input string.

public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        
        StringBuffer rem = new StringBuffer("");
        
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                rem.append(str.charAt(i));
            }
        }
        return rem.toString();
	}

}