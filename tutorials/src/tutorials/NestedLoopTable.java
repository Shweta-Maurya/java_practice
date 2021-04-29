package tutorials;

public class NestedLoopTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j ,k ;
		for (i = 1; i<=11;i++) {
			for (j= 1;j<=20;j++) {
				k =i * j;
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}

}
