package tutorials;

public class NoChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int n = 010;
				int ans=0;
				int revans=0;
				System.out.println(n);
				while(n!=0) {
					int last = n%10;
					if (last==0) {
					ans = ans*10 + last+5;
					//System.out.print(last);
					}
					else
						ans = ans*10 + last;
					n=n/10;
				}
				//System.out.println(ans);
				while(ans!=0) {
					int last = ans%10;
			
						revans = revans*10 + last;
					ans=ans/10;
				}
				System.out.println(revans);
			}	 
		}
	


