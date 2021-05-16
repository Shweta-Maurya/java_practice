package tutorials;

import java.util.Scanner;

public class Pattern10Whileloop {
	/*
	
      *
     **
    * *
   *  *
  *   *
 *    *
 ******
*/
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int space2 =1;
	int star = 1;
	int space = n ;
	int a = n;
	while(n!=0)
	{
		for(int i=1;i<space;i++)
			{
				System.out.print(" ");
			}
		
		System.out.print("*");
		
		for (int i = 2;i<space2; i++ )
			{
			System.out.print(" ");
			}
		
		if(n-a==0){
	           
	       }
	       else{
	           System.out.print("*");
	          
	       }
		System.out.println("");
	
		space -= 1;
		space2 += 1;
		
		n -=1;
		 
	}
	for(int i=1;i<=a;i++)
	{
		System.out.print("*");
	}
	}
}
