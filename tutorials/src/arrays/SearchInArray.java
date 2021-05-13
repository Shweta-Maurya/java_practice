package arrays;

import java.util.Arrays;

public class SearchInArray {

	public static void main(String[] args) {
	
		int arr[] = {20,12,34,56,7,84,30,7,98,56,7,89,3,7,67,8,7,92,};
		System.out.println( Search(arr,92));	
		System.out.println(Arrays.toString(Alloccurence(arr, 7)));

	}
	public static int Search(int array[], int ele) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	public static int[] Alloccurence(int []arr, int ele) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}
	}
		int ans[] = new int[count];
		int j =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				ans[j] = i;
				j++;
				}
}
		return ans;
}
}