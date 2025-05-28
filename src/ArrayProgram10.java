import java.util.ArrayList;

public class ArrayProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to remove duplicate elements from an array.
		int[] x = {1,2,2,3,4,5,4,6,7,6,1,7,};
		ArrayList<Integer>y=new ArrayList<Integer>();
		for(int i=0; i<x.length; i++) {
			if(y.contains (x[i])) {
				
			}else {
				y.add(x[i]);
			}
		}
		System.out.println(y);
	}

}
