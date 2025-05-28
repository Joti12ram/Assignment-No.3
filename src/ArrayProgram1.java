
public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the largest element in an array.
		int arr[]= {12, 45, 23, 67, 34, 89, 21};
		int max=arr[0];
		 max=0;
		 for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		 }
		System.out.println(max);
	}

}
