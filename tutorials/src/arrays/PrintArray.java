package arrays;

public class PrintArray {

	public static void main(String[] args) {
		int arr [][]= { {11,12,13,14},
						{15,16,17,18},
						{19,20,21,22},
						{23,24,25,26}};
		printarray(arr);

	}
//	11 12 13 14 
//	   16 17 18 
//	      21 22 
//	         26 
	            
	public static void printarray(int arr[][]) 
	{
		int row =0;
		int col=0;
		int sp=0;
		for(int j = row; j< arr.length; j++)
		{
			for (int i =col ; i<arr[0].length; i++) 
			{
				System.out.print(arr[j][i]+ " ");
			}
			col+=1;
			System.out.println();
			for (int i =0;i<=sp;i++)
			{
				System.out.print("   ");
			}
			sp++;
		}
	}
}
