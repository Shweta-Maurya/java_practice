package arrays;
import java.util.Arrays;

public class MaximumInArray {
	public static void main(String[] args) {
		
		int arr[] = {10 , 30, 32,56,90,43,88,99};
		System.out.println(Arrays.toString(arr));
		
		int m = maximum(arr);
		System.out.println(m);

	}
	public static int maximum(int[] array) {
	int	max = Integer.MIN_VALUE;// produce lowest value in integer range 
	
	for(int i =0; i< array.length; i++) {
		
		if (max < array[i]) 
		{
			max = array[i];
		}
		}return max;
	}
}
