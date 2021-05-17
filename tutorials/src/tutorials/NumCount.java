package tutorials;

import java.util.Scanner;

public class NumCount {
	public static void main(String[] args) {
		//print how many times a digit  occur in a number
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int digit = sc.nextInt();
		int count =0;
		long d;
		while(num!=0)
		{
			d = num%10;
			if( d== digit)
			{
				count += 1;
			}
			num=num/ 10;
			
	}
		System.out.print(count);
	}
}
