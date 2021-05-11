package tutorials;

import java.util.Scanner;

public class ArmstrongNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 		Scanner sc = new Scanner(System.in);
		 		System.out.println("enter a no:");
		 		int num= sc.nextInt();
		 		int num2 = num;
		 		int sum=0;
		 		while(num!=0) {
		 		int store= num % 10;
		 		sum = store * store * store + sum;
		 		num = num/10;
		 		}
		 		if(num2==sum) {
		 		System.out.println("armstrong no");
		 		}
		 		else {
		 			System.out.println("not");
		 		

		 }


	}

}
