package week3.assignment2w3;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			char[] a = text1.toCharArray();
			char[] b = text2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)==true) {
				System.out.println("given texts are anagram");
			}else {
				System.out.println("given text are not anagram");
			}
		}
	}

}
