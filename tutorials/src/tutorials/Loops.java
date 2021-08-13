package tutorials;

public class Loops {

	public static void main(String[] args) {
		// sum of 1 to 5 number
		int sum=0;
		for (int i = 1 ; i <= 5; i ++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum + "updated");
	}

}
