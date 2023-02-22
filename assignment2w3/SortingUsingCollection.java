package week3.assignment2w3;
import java.util.ArrayList;
import java.util.Collections;
public class SortingUsingCollection {

	public static void main(String[] args) {
		ArrayList<String> value = new ArrayList<String>();
		value.add("HCL");
		value.add("Wipro");
		value.add("Aspire Systems");
		value.add("CTS");
		System.out.println(value.size());
		Collections.sort(value);
		Collections.reverse(value);
		System.out.println(value);
	}
}
