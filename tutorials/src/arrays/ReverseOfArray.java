package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		reversearray(arr);
		System.out.print(Arrays.toString(arr));
	

	}
	public static void reversearray(int arr[] )
	{
		int li=0;
		int hi = arr.length-1 ;
		while(li<hi) {
			int t =arr[li];
			arr[li] = arr[hi];
			arr[hi] = t;
			li +=1;
			hi-=1;
		}
	}

}
