
public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to calculate the sum of all elements in an array.
		int[]a={50,30,40,60,20,70};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum + a[i];
		}
		System.out.println("The sum is :" +sum);
		
	}

}
