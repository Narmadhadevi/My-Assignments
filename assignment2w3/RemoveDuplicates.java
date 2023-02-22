package week3.assignment2w3;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="PayPal India";
		char[] array = text.toLowerCase().toCharArray();
		Set<Character> charSet = new TreeSet<Character>();
		Set<Character> dupCharSet = new TreeSet<Character>();
		for(Character i:array) {
			if(!charSet.add(i)) {
				dupCharSet.add(i);
			}
		}
		System.out.println(dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println(charSet);
		for(Character j:charSet) {
			if(j!=' ') {
				System.out.print(j);
			}
		}
		
		
	}
}
