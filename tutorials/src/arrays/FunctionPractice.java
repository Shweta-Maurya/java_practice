package arrays;

public class FunctionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 200;
		int b = 500;
		System.out.println(a+ " " + b);
		swap(a,b);
		System.out.println(a+ " " + b);
		
		

	}
	public static void swap(int a , int b) {
		int t= a;
		a= b;
		b = t;
		System.out.println(a + " " + b);
	}

}
