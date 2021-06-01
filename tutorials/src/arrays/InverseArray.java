package arrays;

import java.util.Arrays;

public class InverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1r[] = {3,0,4,1,2};
		int inv[] = inverse(ar1r);
		System.out.println(Arrays.toString(ar1r));
		System.out.println(Arrays.toString(inv));

	}
	public static int[] inverse(int[] arr) 
	{
		int ava[] = new int [arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			ava[arr[i]]=i;
		}
		return ava;
	}

}
