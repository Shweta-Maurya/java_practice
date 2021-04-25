package tutorials;
import java.util.Scanner;

public class AirthmeticOperators {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a * a + b * b + 2 * a * b;
		int d = (a + b) * (a * b);
		
		System.out.println(c);
		System.out.println(d);
		
		double e = (double)b / (double)a;
		double f = (double)b % (double)a;
		System.out.println(e);
		System.out.print(f);
	}

}
