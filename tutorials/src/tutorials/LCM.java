package tutorials;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		
						int a  = 32;
						int b = 60;
						int div = 1;
						int hcf=1;
						int mini = Math.min(a, b);
						while(div<=mini)
						{
							if(a%div==0 && b%div==0)
							{
								System.out.println(div);//this will print all common factor ;
								hcf = div; //this will store highest common factor coz every time loop execute value of hcf is updated 
							}
							div++;
						
						}	
						int lcm = a*b/hcf;
						System.out.println("LCM lowest common factor of a and b is : "+lcm);
						System.out.println("highest common factor of a and b is : "+hcf);//this will print highest common factor
						
			}

		}

