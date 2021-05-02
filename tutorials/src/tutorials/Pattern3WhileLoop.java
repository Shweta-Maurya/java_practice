package tutorials;

import java.util.Scanner;

public class Pattern3WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint=
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int	space =0 ;
		while(n!=0)
		{
			for(int i = 1; i <= space; i++)
			{
				System.out.print(" ");
			}
			for(int i = 1; i <= star; i++)
			{
				System.out.print("*");
			}
			star = star-1;
			space += 1;
		n= n-1;
		System.out.println();
		}
	

	}

}
