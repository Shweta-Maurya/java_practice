package arrays;

import java.util.Arrays;

public class RotationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		rotation(arr,5);
		

	}
	public static void rotation(int array[],int k) {
		k = k%array.length;
		if (k<0) {
			k+=array.length;
		}
		for(int j = 1; j<= k; j++) {
			int	temp=array[array.length-1];
			for(int i = array.length-1;i>=1;i--) {
				array[i] = array[i-1];
			}
			array[0]=temp;
			System.out.println(Arrays.toString(array));
			System.out.println();
		}
		
	}
	

}
