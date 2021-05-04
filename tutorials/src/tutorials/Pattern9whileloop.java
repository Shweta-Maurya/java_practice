package tutorials;

import java.util.Scanner;

public class Pattern9whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n;
		int star = 1;
		
		int temp = 2*n-1;
		while(temp!= 0) {
			for(int i=1; i <space; i++)
			{
				System.out.print(" ");
			}
			for(int i =1; i <=star; i++)
			{
				System.out.print("*");
			}
			if(temp>n)
			{
				space -=1;
				star +=1;
			}
			else if (temp<=n)
			{
				space +=1;
				star -=1;
			}
			temp -= 1;
			System.out.println();
		}
	}

}
