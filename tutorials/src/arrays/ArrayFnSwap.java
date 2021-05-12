package arrays;

public class ArrayFnSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,6,53};
		int arr1[]= {89,45,64,33,55};
		System.out.println(arr[0]+" "+ arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0]+" "+ arr[1]);

	}
	public static void swap(int a , int b) {
		int t= a;
		a= b;
		b=t;
	}

}
