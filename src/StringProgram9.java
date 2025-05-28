import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the first non-repeated character in a string.
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Character result = findFirstNonRepeatedChar(input);
        
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated characters found.");
        }
        
        scanner.close();
    }

    public static Character findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeated character found
	}

}
