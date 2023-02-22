package week3.assignment2w3;

public class PalindromeString {

	public static void main(String[] args) {
		String text="madam";
		String rev="";
		
		for(int i=text.length()-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
if(text.equalsIgnoreCase(rev)==true) {
	System.out.println(text+" given string is palindrome");
}else {
	System.out.println(text+" given string is not palindrome");
	
}
	}

}
