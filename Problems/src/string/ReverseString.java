package string;

import java.util.Stack;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "This is test string";
		usingSingleCharArray(s);
		usingMultipleCharArray(s);
		usingRecursion(s);
		usingStringBuilder(s);
		usingStack(s);
	}
	
	//This is using temp variable. This is the efficient way bcos it loops only 1/2 of string length.
	public static void usingSingleCharArray(String s){
		char[] charArr = s.toCharArray();
		
		char temp;
		for(int i=0;i<charArr.length/2;i++){   //loop only 1/2 of the string length else it'll start replacing again.
			temp = charArr[i];
			
			charArr[i] = charArr[charArr.length - (i+1)];
			charArr[charArr.length - (i+1)] = temp;
		}
		System.out.println(new String(charArr));
	}
	
	//This is using separate/new char array.
	public static void usingMultipleCharArray(String s){
		char[] charArr = s.toCharArray();
		
		char[] newString = new char[charArr.length];
		for(int i=0;i<charArr.length;i++){
			newString[i] = charArr[charArr.length - (i+1)];
		}
		System.out.println(String.copyValueOf(newString));
	}
	
	//This is using recursion.
	public static void usingRecursion(String s){
		if(s.length() != 0){
			System.out.print(s.charAt(s.length()-1)); //print the last char.
			usingRecursion(s.substring(0, s.length() -1)); //send the remaining string again to method from 0 to last -1.
		}
		return;
	}
	
	public static void usingStringBuilder(String s){
		System.out.println("");
		StringBuilder stringBuilder = new StringBuilder(s);
		for(int i =0;i<s.length()/2;i++){
			stringBuilder.setCharAt(i, s.charAt(s.length()-(i+1))); //this is to set i char from string's length - i +1 char.
			stringBuilder.setCharAt(s.length()-(i+1), s.charAt(i)); //this is to set string length - i +1 char from string's i char.
		}
		System.out.println(stringBuilder.toString());
	}
	
	public static void usingStack(String s){
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while(i<s.length()){
			stack.push(s.charAt(i));
			i++;
		}
		
		while(!stack.empty()){
			System.out.print(stack.pop());
		}
	}
	
	

}
