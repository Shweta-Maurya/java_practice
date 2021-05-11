package tutorials;

public class AllArmstrongNos {

	public static void main(String[] args) {
	
		int start = 10;
		int num = 10000;
		
		
		for( int i=start;i<num;i++)
			{
			int sum =0;
			int n= i;
			while(n!=0) {
			int	lastdigit=n%10;
			sum = lastdigit *lastdigit *lastdigit + sum;
			n=n /10;
			}
		if (sum==i) {
			System.out.println(i);
		}
		}
	  }
		


}
