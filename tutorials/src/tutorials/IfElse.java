package tutorials;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n= sc.nextInt();
		
		
		if (n%2==0)
		{
			System.out.print("even");
		}
		else if (n%2!=0)
		{
			System.out.println("odd");
		}
		

	}

}
