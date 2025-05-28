
public class StringProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to remove all white spaces from a string.
		String str= "MY   SPACE   CLASS";
		System.out.println("Before removing the white spaces:" +str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces:" +str);
	}

}
