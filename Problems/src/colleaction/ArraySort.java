package colleaction;

import java.util.Arrays;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] fruits = new String[] {"apple","orange","banana", "kiwi","mango"};
		
		Arrays.sort(fruits);
		
		for(int i =0;i<fruits.length;i++){
			System.out.println(fruits[i]);
		}
		
	}

}
