package tutorials;

import java.util.Scanner;

public class Nos {

	public static void main(String[] args) {
		//program to find no of digit in a number
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numberOfDigit = (int)Math.log10(n) + 1;
		System.out.print(numberOfDigit);
	}

}
