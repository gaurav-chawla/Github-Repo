package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeperateEvenOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int[] numbers = {2,8,3,7,0,4,4,6,5,8,8,8,9,3};
		
		seperateEvenOddNumbersUsing1Array(numbers);
		seperateEvenOddNumbersUsing1Array1(numbers);
		seperateEvenOddNumbersUing1Array2Loops(numbers);
		seperateEvenOddNumbersUsing2ArrayList(numbers);
	}
	
	//This is fastest way using 1 array.
	public static void seperateEvenOddNumbersUsing1Array(int[] numbers){
		int temp = 0;
		int j = 0;
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void seperateEvenOddNumbersUsing1Array1(int[] numbers){
		int temp = 0;
		int i =0;
		int j = numbers.length -1;
		while(i<j){
			if(numbers[i]%2==0){
				i++;
			}
			if(numbers[j]%2!=0){
				j--;
			}
			if(i<j){
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void seperateEvenOddNumbersUing1Array2Loops(int[] numbers){
		int temp = 0;
		int j = 0;
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2!=0){
				for(j=i;j<numbers.length;j++){
					if(numbers[j]%2==0){
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	
	
	public static void seperateEvenOddNumbersUsing2ArrayList(int[] numbers){
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(int i =0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				even.add(numbers[i]);
			}else{
				odd.add(numbers[i]);
			}
		}
		
		
		
		//System.out.println(Arrays.toString(numbers));
		System.out.println(even.toString());
		System.out.println(odd.toString());
	}

}
