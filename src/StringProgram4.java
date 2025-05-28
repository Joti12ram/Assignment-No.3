import java.util.Scanner;

public class StringProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to check if a string is a palindrome.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		String org_str=str;
		String rev=" ";
		int len=str.length();
		
		
		for(int i=len-1; i>=0; i--) {
			rev=rev +str.charAt(i);
		}
		
		if(org_str==rev) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
	}

}
