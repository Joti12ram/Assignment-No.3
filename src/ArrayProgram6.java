
public class ArrayProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to copy one array to another.
		int arr1[]= {3,4,5,8,7,2};
		int arr2[]=new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
			}
		System.out.println("Elements of Original array:");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+ " ");
	}	
		System.out.println();
		System.out.println("Elements of new array :");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]+ " ");
		}
	}

}
