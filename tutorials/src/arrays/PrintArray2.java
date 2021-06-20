package arrays;

public class PrintArray2 {

	public static void main(String[] args) {
		int arr[][] ={ {11,12,13,14},
					{15,16,17,18},
					{19,20,21,22},
					{23,24,25,26}};
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j<arr[0].length; j++)
			{
				if(i>j)
				{
				System.out.print(""+"\t");	
				}
				else 
				{
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}
