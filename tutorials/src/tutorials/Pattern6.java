package tutorials;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		________#___
		______#___#___
		____#___#___#___
		__#___#___#___#___
		#___#___#___#___#___
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++)
		{
			for(int j = 1; j<=n-i; j++)
			{
				System.out.print("__");
			}
			for(int j = 1;j<=i; j++)
			{
				System.out.print("#___");
			}
			
			System.out.println();
		}

	}

}
