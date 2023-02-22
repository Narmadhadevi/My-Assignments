package week3.assignment2w3;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set.add(data[i]);
			
		}System.out.println("The real array is "+set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		int size = list.size();
		System.out.println("The size of array is "+size);
		System.out.println("The second largest number from array is "+list.get(size-2));
		
	}

}
