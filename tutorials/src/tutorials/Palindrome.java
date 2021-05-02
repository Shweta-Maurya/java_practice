package tutorials;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverseNos = 0;
		int lastDigit ;
		while(temp > 0) {
			lastDigit = temp % 10;
			reverseNos = reverseNos * 10 + lastDigit;
			temp /= 10;
		}
		if (reverseNos == n) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
