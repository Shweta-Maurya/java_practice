package tutorials;
import java.util.*;
public class Break {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			int n = sc.nextInt();
			if (n < 0 )
				break;
		}

	}

}
