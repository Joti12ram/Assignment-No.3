import java.util.HashMap;
import java.util.Map.Entry;

public class StringProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to count the frequency of characters in a string.
		String x= "MYSPACECLASS";
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		for(int i=0; i<x.length(); i++) {
			if(!hm.containsKey(x.charAt(i))) {
				hm.put(x.charAt(i), 1);
			}else {
				int count=hm.get(x.charAt(i));
				hm.put(x.charAt(i), count +1);
			}
		}
		for(Entry<Character, Integer> hm1:hm.entrySet()) {
			System.out.println(hm1.getKey() + " " +hm1.getValue());
		}
	}

}
