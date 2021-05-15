package tutorials;
import java.util.*;
public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		
		int a = sc.nextInt();
		int count =0;
		for(int i=2;i<=a/2;i++) {
			if (a%i == 0)
			{
				count =1;
				System.out.println(i);
			}
			
		}
		if (count == 1) {
			System.out.print("non prime");
			
		}
		else
		{
			System.out.print("prime");
		}

	}

}
