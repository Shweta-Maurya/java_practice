package tutorials;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/n ---->series
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		float i;
		
		float sum=0;
		
		for ( i=1; i<=a; i++) {
			sum = sum + 1/i;
		}
		
		System.out.print(sum);

	}

}
