package arrays;

import java.util.Arrays;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] val: arr)
		{
		System.out.println(Arrays.toString(val));
		
		}
		System.out.println();
		wave(arr);
	}
	public static void wave(int[][] arr)
	{
		for(int i=0; i<arr[0].length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<arr.length;j++)
				{
				System.out.print(arr[j][i]);
				}
			}
			else
				{
				for(int j=arr.length-1;j>0;j--)
				{
				System.out.print(arr[j][i]);
				}
				}
		}
	}

}
