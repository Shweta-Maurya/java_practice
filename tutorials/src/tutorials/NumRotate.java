package tutorials;

public class NumRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 123456;
		int nod=0;
		int rot=2;
		int copy = num;
		while (copy!=0) {
			copy=copy/10;
			nod= nod+1;
		}
		rot = rot%nod;//for rotation having value larger than number of digits
		System.out.println(nod);
		int div = (int)Math.pow(10, rot);
		int p1 = num/div;
		int p2 = num%div;
		System.out.println(p1+ " "+p2);
		int mul = (int)Math.pow(10,  nod-rot);
		System.out.println(p2*mul);
		System.out.print(p2+""+p1);
	}
}

