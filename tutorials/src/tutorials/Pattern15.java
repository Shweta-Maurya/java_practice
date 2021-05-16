package tutorials;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		*           * 
		  *       *   
		    *   *     
		      *       
		    *   *     
		  *       *   
		*           * 
*/
		int n=7;
		int star =1;
		int row = 1;
		while (row<=n) {
			for (int i =1;i<=n;i++) {
				if (i ==row||row+i==n+1){
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}row ++;
			System.out.println();
		}


	}

}
