package arrays;

public class BarGraphArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,7,1,6};
		bargraph(arr);

	}
	public static void bargraph(int [] arr) {
		int maxi= maximum(arr);
		int row = 1 ;
		while(row<=maxi) {
			for(int i =0;i<arr.length;i++) {
				if(maxi-arr[i]<row) {
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			row++;
			System.out.println();
			
		}
	}

	public static int maximum(int arr[]) {
		int maxi=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(maxi<arr[i])
			{
				maxi = arr[i];
			}
		
		}
		return maxi;

}
}
