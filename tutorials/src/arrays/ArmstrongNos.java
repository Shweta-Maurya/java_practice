 package arrays;

import java.util.Scanner;

public class ArmstrongNos {

	public static void main(String[] args) {
		printArmstrong(10, 1000);
	}
	public static void printArmstrong(int li , int up) {
		for(int i = li; i <= up; i++) {
			if (isArmstorng(i) == true) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstorng(int n) {
		int nod = noofdigit(n);
		int ans = 0;
		int in =n ;
		while(n!=0) {
			int rem = n%10;
			ans += (int)Math.pow(rem,nod);
			n /= 10;
		}
			if (ans == in)
			{
				return true;
			}
			else 
				return false;
	}
	public static int noofdigit(int n) {
		int count =0;
		while(n!=0) {
			count++;
			n /=10;
		}
		return count;
	}
}	