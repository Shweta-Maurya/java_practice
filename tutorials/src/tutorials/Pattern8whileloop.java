package tutorials;

import java.util.Scanner;

public class Pattern8whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = 1;
		int f= n;
		System.out.println("*");
		while(n!=2)
		{
			for(int i=1; i<=star; i++)
			{
				System.out.print("* ");
			}
			for (int i =1; i< space; i++)
			{
				System.out.print("  ");
			}
			space += 1;
			n -= 1;
			System.out.println("*");
			
		}
		for(int i=1; i<= f; i++)
		{
			System.out.print("* ");
		}

	}

}
