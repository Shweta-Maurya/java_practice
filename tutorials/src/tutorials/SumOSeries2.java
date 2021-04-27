package tutorials;
import java.util.*;
public class SumOSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 - 1/2 + 1/3 - 1/4 + 1/5 - ...... 1/n     ---->series
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float sum =0;
		
		for(float i =1; i<=n; i++) {
			if (i % 2 == 0) {
				sum =sum - 1/i;
			}
			else {
				sum = sum + 1/i;
			}
		
		}
		System.out.println(sum);
		
	}

}
