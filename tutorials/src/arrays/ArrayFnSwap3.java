package arrays;

public class ArrayFnSwap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,6,53};
		int arr1[]= {89,45,64,33,55};
		System.out.println(arr[0]+" "+ arr1[0]);
		swap(arr, arr1);
		System.out.println(arr[0]+" "+ arr1[0]);
		

	}
	public static void swap(int arr[], int arr1[]) {
		int[] t = arr;
		arr = arr1;
		arr1 = t;
	}

}
