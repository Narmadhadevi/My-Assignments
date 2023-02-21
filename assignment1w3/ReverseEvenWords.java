package week3.assignment1w3;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] text=test.split(" ");
		for(int i=0;i<text.length;i++){
			if(i%2!=0) {
				String[] word=text[i].split("");
		for(int j=word.length-1;j>=0;j--) {
			if(j%2==0) {
				System.out.print(word[j]);
			}else {
			System.out.print(word[j]);	
			}
		}
			}else {
			System.out.print(" "+text[i]+" ");
			}
		
	}
	
	}
}

