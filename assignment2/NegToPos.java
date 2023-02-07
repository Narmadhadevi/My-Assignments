package week1.assignment2;

public class NegToPos {
	public static void main(String[] args) {
		int num=-40;
		if(num<0) {
			System.out.println("Negative number "+num);
		}else if(num>0) {
			System.out.println("positive number "+num);
		}else {
			System.out.println("neutral number zero");
		}
		int n=~(num-1); //int n=Math.abs(num)
		System.out.println("negative to positive number is " + n);
	}

}
