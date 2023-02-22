package week3.assignment2w3;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
String text = "We learn java basics as part of java sessions in java week1";
String[] array=text.split(" ");
LinkedHashSet<String> unique = new LinkedHashSet<String>();
/*
 * for(int i=0;i<array.length;i++) { System.out.println(array[i]); }
 */
for(int i=0;i<array.length;i++) {
	unique.add(array[i]);
}System.out.println(unique);

	}

}
