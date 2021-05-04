package tutorials;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n= sc.nextInt();
		int i =1;
		int j=1;
		int space = n;
		int num = 1;
		while(n!=0)
		{
			for(i = 1; i<space;i++)
			{
				System.out.print(" ");
			}
			for(j = 1; j<=num;j++)
			{
				System.out.print(j);
			}
			n-=1;
			space -=1;
			num+=2;
			System.out.println();
		}

	}

}
