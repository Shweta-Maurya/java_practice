package tutorials;

import java.util.Scanner;

public class Pattern4WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		
		while(n!=0) {
			for(int i = 1; i<= star;i++)
			{
				System.out.print("*");
			}
			star -= 1;
			n -=1;
			System.out.println();
		}
				
	}

}
