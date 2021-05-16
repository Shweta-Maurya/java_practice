package tutorials;
public class Pattern16Nos {
	public static void main(String[] args) {
		int n =5;
		int row =1;
		int count =1;
		int space = n;
		int no = 1;
		while(row<=n) {
			for (int i =1 ; i <space; i++) {
				System.out.print(" ");
			}
			int nums=1;
			for(int i = 1 ; i<=no;i++)
			{
				System.out.print(nums);
				if (i<row)
					nums++;
				else
					nums--;
				}
			no+=2;;
			row++;
			space-=1;
			System.out.println();
		}
}
}
