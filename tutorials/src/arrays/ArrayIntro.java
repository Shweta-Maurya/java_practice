package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration of array
		//method 1
		int[] marks = new int[5];
		//method 2
		int section[] = new int[4];
		//method 3
		int[] rollno;
		rollno = new int[10];
		
		System.out.println(marks[0]);
		
		int age[] = {9, 5, 6,6 ,3,33,2,60};
		//updating value at index 3
		marks[3] = 32;
	 	System.out.println(marks[3]);
				for(int i =1; i<age.length;i++)
				{
					System.out.println(age[i]);
				}

	}

}
