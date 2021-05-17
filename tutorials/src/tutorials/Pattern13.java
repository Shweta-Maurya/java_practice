package tutorials;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
        * * * * * 
      * * * * 
    * * * 
  * * 
* 
  * * 
    * * * 
      * * * * 
        * * * * * 

        */
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int star = n;
		int space = n;
		while(row <=2* n -1) {
			for(int i =1;i<space;i++) {
				System.out.print("  ");
			}
			for(int i =1;i<=star;i++) {
				System.out.print("* ");
			
			}
			if(row<n) {
			star-=1;
			space-=1;
			}
			else {
				space+=1;
				star+=1;
			}
			row+=1;
			System.out.println();
			
		}

	}

}
