package week3.assignment1w3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] tes=test.toCharArray();
		int val=tes.length;
		System.out.println(val);
		for(int i=0;i<val;i++) {
			if(i%2==1) {
				tes[i]=Character.toUpperCase(tes[i]);
				System.out.print(tes[i]);
			}else {
				System.out.print(tes[i]);
			}
		}


	}

}
