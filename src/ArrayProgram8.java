
public class ArrayProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to search for an element in an array.
		int []a= {5,7,10,15,20};
		boolean bflag = false;
		int num=10;
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				bflag = true;
				break;
			}
		}
		if(bflag==true) {
			System.out.println("Number is found");
		}else {
			System.out.println("Number is not found");
		}

	}

}
