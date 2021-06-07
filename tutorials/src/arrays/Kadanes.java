package arrays;

import java.util.Arrays;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,-6,5,-1,6};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Kadanes(arr));
	//	System.out.print(Kadanes2(arr));
		Kadanes2(arr);
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
	//print all elements for maxsum 
	public static void Kadanes2(int[] arr){
		int sum=0;
		int maxsum=0;
		int maxsi=-1;
		int maxei = -1;
		int si = 0;
		for(int i =0 ; i<arr.length; i++)
		{
			sum= sum+ arr[i];
			if(sum>maxsum)
			{
				maxsum=sum;
				maxsi= si;
				maxei=i;
			}
			if(sum<0)
			{
				sum=0;
				si=i+1;
			}
		}
		for(int i=maxsi; i<= maxei; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.print(maxsum);
	}
}
