package tutorials;

public class ReverseOfNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30043869;
		int ans=0;
		while(n!=0) {
			int last = n%10;
			ans = ans*10 + last;
			//System.out.print(last);
			n=n/10;
		}
		System.out.println(ans);

	}

}
