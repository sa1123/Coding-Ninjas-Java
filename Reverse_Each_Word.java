//Implement a function so as to print the sentence such that each word in the sentence is reversed.

public class Solution {
    
    public static String reverseWord(String s){
        StringBuffer rev = new StringBuffer("");
        
        for(int i = s.length()-1; i>=0; i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

	public static String reverseEachWord(String str) {
		//Your code goes here
        String[] store = str.split(" ");
        
        StringBuffer reverse = new StringBuffer("");
        
        for(int i = 0; i<store.length; i++){
            reverse.append(reverseWord(store[i]));
            reverse.append(" ");
        }
        return reverse.toString();
	}

}