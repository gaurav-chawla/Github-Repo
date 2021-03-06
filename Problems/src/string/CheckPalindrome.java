package string;

import java.util.Stack;

public class CheckPalindrome {

	/**
	 * Palindrome is string which reads same from both sides forward or backward. i.e. "112211";
	 */
	public static void main(String[] args) {
		String s = "112211";
		usingCharArray(s);
		usingStack(s);
		usingStringMethods(s);
		usingRecursion(s);
	}
	
	public static void usingCharArray(String s){
		char[] c = s.toCharArray();
		for(int i =0;i<s.length()/2;i++){
			if(c[i] != c[c.length-(i+1)]){
				System.out.println("This is not palindrome");
				return;
			}
		}
		System.out.println("This is palindrome");
	}
	
	public static void usingStack(String s){
		Stack<Character> stack = new Stack<Character>();
		int i =0;
		while(i<s.length()){
			stack.push(s.charAt(i));
			i++;
		}
		char[] c = new char[s.length()];
		int j =0;
		while(!stack.isEmpty()){
			c[j] = (char)stack.pop();
			j++;
		}
		
		if(new String(c).equals(s)){
			System.out.println("This is palindrome");
		}else{
			System.out.println("This is not palindrome");
		}
	}
	
	public static void usingStringMethods(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i) != s.charAt(s.length() - (i+1))){
				System.out.println("This is not palindrome");
				return;
			}
		}
		System.out.println("This is palindrome");
	}
	
	public static void usingRecursion(String s){
		if(s.length() < 2){
			System.out.println("This is palindrome");
			return;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)){
			usingRecursion(s.substring(1,s.length()-1));
			return;
		}
		System.out.println("This is not palindrome");
	}

}
