package tutorials;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* * * * * 
		*       * 
		*       * 
		*       * 
		* * * * * 
*/
		int n=5;
		int star =1;
		int row = 1;
		while (row<=n) {
			for (int i =1;i<=n;i++) {
				if (i ==1||i==n||row==1||row==n) {
					System.out.print("* ");
					
				}
				else 
					System.out.print("  ");
			}row ++;
			System.out.println();
		}

	}

}
