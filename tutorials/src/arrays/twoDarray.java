package arrays;

import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array row's  and  column's : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		int b[][]= new int[row][col];
		
		System.out.println("Enter array a");
		for(int i =0; i<row;i++)
		{
			for(int j =0; j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter array b");
		for(int i =0; i<row;i++)
		{
			for(int j =0; j<col;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int [row][col]; 
		for(int i =0; i<row;i++)
		{
			for(int j =0; j<col;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				
			}
		}
		
		for(int i =0; i<row;i++)
		{
			for(int j =0; j<col;j++)
			{
				
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
	

}
