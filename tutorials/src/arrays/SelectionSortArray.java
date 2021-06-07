package arrays;

import java.util.Arrays;

public class SelectionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,4,5,1};
		System.out.println(Arrays.toString(arr));
			sort(arr);
			System.out.print(Arrays.toString(arr));
		

	}
	//function to find minimum element in array
	public static int minimum(int arr[],int si,int ei) 
	{
		int min =si;
		for(int i= si; i<= ei ; i++) 
		{
			if (arr[min]>arr[i]) 
			{
				min=i;
			}
		}
		return min;
	}
	//function to sort an array
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min= minimum(arr,i,arr.length-1);
			//swap
			int t=arr[i];
			arr[i]=arr[min];
			arr[min]=t;
		}
	}

}
