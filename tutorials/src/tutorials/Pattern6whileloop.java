package tutorials;
import java.util.Scanner;
public class Pattern6whileloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				int star = 1;
				int space = n;
				while(n!=0) {
					for (int i =1;i<space;i++) {
						System.out.print(" ");
					}
					for(int i = 1; i<= star; i++) {
						System.out.print("* ");
					}
					space -=1;
					star +=1;
					n -=1;
					System.out.println();
				}
			

			}

		

	}



