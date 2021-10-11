//Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String[] store = input.split(" ");
        
        StringBuffer reverse = new StringBuffer("");
        
        for(int i = store.length-1; i>=0; i--){
            reverse.append(store[i]);
            reverse.append(" ");
        }
        return reverse.toString();
	}
}
