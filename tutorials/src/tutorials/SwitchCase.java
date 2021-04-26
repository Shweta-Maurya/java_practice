package tutorials;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
		case 5:
			System.out.println("Good");
			break;
			
		}

	}

}
