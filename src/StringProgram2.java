import java.util.Scanner;

public class StringProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to count the number of vowels and consonants in a string.
		Example obj=new Example();
		Scanner sc= new Scanner(System.in);
		System.out.println("Input:" );
		String str= sc.next();
		obj.count(str);
	}
}
		
		class Example{
			void count(String str) {
				int vowels=0, consonants=0;
			str=str.toUpperCase()	;
			for(int i=0; i<str.length(); i++) {
				char ch= str.charAt(i);
				if(Character.isLetter(ch));
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowels++;
				}else {
					consonants++;
			}
				System.out.println("Number of Vowels :" +vowels);
				System.out.println("Number of consonants:" +consonants);
				
			
			}
	}

}
