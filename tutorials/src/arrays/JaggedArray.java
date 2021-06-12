package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		 int[][] arr = new int[3][];
		 
		 System.out.println(arr);
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		
		 arr[0] = new int [2];
		 arr[1] = new int [4];
		 int [] a = new int [3];
		 arr[2] =a;
		
		 
		for(int row =0;row<arr.length;row++)
		{
			for(int col =0 ; col<arr[0].length;col++)
			{
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
		
		for(int[] val: arr)
		{
			for (int x: val)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
