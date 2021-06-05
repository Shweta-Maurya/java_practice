package arrays;

import java.util.Arrays;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,-6,5,-1,6};
		Kadanes(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print(Kadanes(arr));

	}
	//print maximum sum  Kadanes
	public static int Kadanes(int[] arr) 
	{
		int sum=0;
		int maxsum= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			sum= sum+ arr[i];
			if(sum>maxsum) {
				maxsum=sum;
			}
			if (sum<0) {
				sum=0;
			}
		}
		return maxsum;
	}
	

}
