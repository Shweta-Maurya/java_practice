package arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		subarray(arr);
		subarrayprint(arr);
		subarraysum(arr);
		maxsumsubarray(arr);

	}
	//index of each subarray
	public static void subarray(int []arr) {
		for (int si= 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {
				System.out.print("("+si+" "+ ei+")");
			}
			System.out.println();
		}System.out.println();System.out.println();
	}
	
	
	
	//print all subarray
	public static void subarrayprint(int []arr) {
		for (int si= 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {
				for(int k=si;k<=ei;k++)
				System.out.print(arr[k]+" ");
				System.out.println();
				}
		
		}
	}
	
	//sum of each subarray
	public static void subarraysum(int arr[])
	{
		for(int si=0;si<arr.length;si++) {
		
			for(int ei= si ; ei<arr.length ; ei++) {
				int sum=0;
				for(int k = si; k<= ei ;k++)
				{
					System.out.print(arr[k]+" ");
					sum= sum+ arr[k];
				}
				
				System.out.println("....."+sum);
			}
		}
		
	}
	//max sum of subarray
	public static void maxsumsubarray(int []arr) {
		int max= Integer.MIN_VALUE;
		for(int si=0;si<arr.length;si++) 
		{	
			int sum=0;
			for(int ei= si ; ei<arr.length ; ei++) {
					sum= sum+ arr[ei];
					System.out.println("*"+sum);
					if( max < sum)
					{
						max = sum;
					}
				}				
			}
		System.out.println("***"+max);
	}

}
