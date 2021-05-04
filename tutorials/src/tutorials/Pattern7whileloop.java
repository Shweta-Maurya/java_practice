package tutorials;

import java.util.Scanner;

public class Pattern7whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  
		*
		**
		***
		****
		***
		**
		*

		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r= 2 *n -1;
		int star = 1;
		
		while (r!=0)
		{
				for(int i = 1; i<=star; i++ )
				{
					System.out.print("*");		
				}
				r =r-1;
		if (r>=n) {
			star +=1;
		}
		else {
			star -= 1;
		}	
			
			System.out.println();
	}
	}

}
