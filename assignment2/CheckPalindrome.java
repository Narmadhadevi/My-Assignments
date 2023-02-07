package week1.assignment2;

public class CheckPalindrome {
	public static void main(String[] args) {
		int temp,rev=0;
		int n=34343;
		for(int i=n;i!=0;i=i/10) {
			temp=i%10;
			rev=rev*10+temp;
		}
		if(n==rev) {
			System.out.println(n+ " is a palindrome number");
		}else {
		System.out.println(n+ " is not a palindrome number");
		}	
	}
	}

