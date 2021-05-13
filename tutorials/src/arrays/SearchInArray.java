package arrays;

public class SearchInArray {

	public static void main(String[] args) {
	
		int arr[] = {20,12,34,56,7,84,30};
		System.out.println( Search(arr,84));	

	}
	public static int Search(int array[], int ele) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==ele) {
				return i;
			}
		}
		return -1;
	}

}
