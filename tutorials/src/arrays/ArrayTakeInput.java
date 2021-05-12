package arrays;

import java.util.Scanner;

public class ArrayTakeInput {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	int[] arr = takeinput();
	display(arr);
		// TODO Auto-generated method stub

	}
public static int[] takeinput() {
	System.out.println("Size of array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i=0;i <arr.length; i++) {
		System.out.println("a["+ i+ "]:");
		arr[i]=sc.nextInt();
	}
	return arr;
}
public static void display(int arr[]) {
	for(int val : arr) {
		System.out.println(val);
	}
}

}
