package array;

import java.util.Arrays;

public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] fs = usingSingleArray(10);
		
		System.out.println(Arrays.toString(fs));
		
		int[] fs1= new int[10];
		for(int i=0;i<10;i++)
			fs1[i] = usingReccursion(i);
		
		System.out.println(Arrays.toString(fs1));
	}
	
	public static int[] usingSingleArray(int lenght){
		
		int[] fs = new int[lenght];
		for(int i =0;i<lenght;i++){
			if(i == 0 || i == 1){
				fs[i] = i;
			}else{
				fs[i] = fs[i-1] + fs[i-2];
			}
		}
		return fs;	
	}
	
	public static int usingReccursion(int n){
		
		if(n==0 || n == 1)
			return n;
		else
			return usingReccursion(n -1) + usingReccursion(n-2);
	}

}
