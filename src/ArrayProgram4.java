
public class ArrayProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the smallest element in an array.
		int[]a={50,30,40,60,20};
		int min=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum element is :" +min);
	}

}
