package tutorials;
import java.util.*;
public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the operation");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		switch(op) {
		case '+':
			result = a + b;
			
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
			default:
				System.out.println("invalid operator");
		}
		System.out.println(result);
	
		

	}

}
