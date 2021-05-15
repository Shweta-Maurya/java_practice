package tutorials;

public class HCF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 75;
		int b= 50;
		int min=Math.min(a, b);
		int div =min;
	//	int hcf;
		
		while(div>=1) {
			if ( a % div ==0 && b % div == 0)
			{
				System.out.println(div);
				break;
			}
			div--;
		}
	
	}

}
