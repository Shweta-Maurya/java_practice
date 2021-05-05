package tutorials;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		     1
		    202
		   30003
		  4000004
		 500000005
		60000000006
      */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int space = n;
		int a = n;
		int num =1;
		int num2 =2;
		int zero =-1;
		while(n!=0)
		{
			for(int i=1;i<space;i++)
			{
				System.out.print(" ");
			}			
				System.out.print(num);
				
			for(int i=0;i<zero;i++)	
			{
				System.out.print("0");
			}
			  if(n-a==0){
		           
		       }
		       else{
		           System.out.print(num2);																													
		           num2+=1;
		       }
				
				
			space -=1;
			num+=1;
			zero+=2;
			n-=1;
			System.out.println();

	}

}
}