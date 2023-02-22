package week3.assignment2w3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		Integer[] a= {1,1,2,3,3,4,5,6,7,2,4,1,3,9,10,0,1,4};
Set<Integer> set = new TreeSet<Integer>();
set.addAll(Arrays.asList(a));
System.out.println(set);
int size = set.size();
System.out.println(size);
for(int i=0;i<=size;i++) {
	if(!set.contains(i)) {
		System.out.println("The missing number is "+i);
	}
}
}
}
