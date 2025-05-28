
public class ArrayProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to merge two arrays.
		int []a= {1,2,3,4,5};
		int []b= {10,20,30,40,50};
		
		int al=a.length;
		int bl=b.length;
		int cl=al+bl;
		int []c=new int [cl];
		
		for(int i=0; i<al; i++) {
			c[i]=a[i];	
		}
		
		for(int i=0; i<bl; i++) {
			c[al+i]=b[i];
		}
		
		for(int i=0; i<cl; i++) {
			System.out.println(c[i]);
		}
	}

}
