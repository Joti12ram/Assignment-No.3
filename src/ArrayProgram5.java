
public class ArrayProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to count even and odd numbers in an array.
		int[]a={5,7,10,15,20,4};
		System.out.println("Even elements in array is:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd elements in array is:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
