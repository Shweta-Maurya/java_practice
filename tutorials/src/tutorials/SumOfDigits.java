package tutorials;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
		int temp = n;
		int sum =0;
		while(temp>0) {
			int lastDigit = temp %10;
			temp = temp / 10;
			sum = sum +lastDigit;
			System.out.println(lastDigit + " " + sum+ " "+temp);
		}
System.out.println("Total Sum is: " + ""+sum);
	}

}
