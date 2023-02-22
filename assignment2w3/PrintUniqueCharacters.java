package week3.assignment2w3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String name="mahesh";
		char[] nam = name.toCharArray();
		Set<Character> value=new HashSet<Character>();
		for(Character i:nam) {
		if(!value.add(i)) {
		value.remove(i);
		}
		}
System.out.println(value);
	}

}
