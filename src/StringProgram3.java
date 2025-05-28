
public class StringProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to reverse a string.
		String x="My Space Class";
		String y=" ";
		for(int i=x.length()-1; i>=0; i--) {
			y=y+x.charAt(i);
		}
		System.out.println(y);
	}

}
