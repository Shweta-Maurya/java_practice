package tutorials;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =38;
		int b = 2;
		int c = 22;
		
		if (a>b) {
			if (a>c) {
				System.out.print(a);
			}else { 
				System.out.print(c);
			}
			
		}else 
		{
			if (b>c)
			{
				System.out.print(b);
			}
			else {
				System.out.print(c);
			}
		}

	}

}
