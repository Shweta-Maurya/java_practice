package arrays;

import java.util.Scanner;

public class Averagemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		for (int i=1; i<n; i++) {
			System.out.println("Enter the marks of students : ");
			marks[i] = sc.nextInt();
		}
		int avg = 0;
		for (int i=1; i<n; i++) {
			avg += marks[i];
		}
		avg /=n;
		System.out.println(avg);
	}

}
