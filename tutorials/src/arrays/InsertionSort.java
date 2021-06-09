package arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		int arr[] = {2,31,1,3,54,6,71,0,9};
		System.out.print("print array : --------------- ");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.print("final array : -------------- "+Arrays.toString(arr));
	}
	public static void insertionsort(int [] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
			int ele = arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]>ele)
				{
					arr[j+1]=arr[j];
				}
				else
				{
					arr[j+1]=ele;
					break;
				}
			}
			if(arr[0]>ele)
			{
				arr[0]=ele;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
