package arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		subarray(arr);
		subarrayprint(arr);

	}
	public static void subarray(int []arr) {
		for (int si= 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {
				System.out.print("("+si+" "+ ei+")");
			}
			System.out.println();
		}System.out.println();System.out.println();
	}
	public static void subarrayprint(int []arr) {
		for (int si= 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {
				for(int k=si;k<=ei;k++)
				System.out.print(arr[k]+" ");
				System.out.println();
				}
		
		}
	}

}
