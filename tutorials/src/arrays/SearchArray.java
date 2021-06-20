package arrays;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int arr[][] ={ 	
					{11,12,13,14},
					{15,16,17,18},
					{19,20,21,22},
					{23,24,25,26}};
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter number to be searched in array:");
		int elein = sc.nextInt();
		System.out.println(ss(arr,elein));

	}
	public static boolean ss(int[][]arr,int ele)
	{
		int row=0;
		int col= arr[0].length-1;
		while(col>=0 && row < arr.length)
		{
			if(arr[row][col]==ele)
			{
				return true;
			}
			else if (arr[row][col]>ele)
			{
				col--;
			}
			else
			{
				row++;
			}
		
		}	return false;
	}

}
