package week1.assignment2;
//0,1,1,2,3,5,8,13
public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8,first=0,sec=1,sum;
System.out.println("The fibanocci series:");
System.out.println(first);
for(int i=1;i<=range;i++) {
sum=first+sec;
first=sec;
sec=sum;
System.out.println(sum);
}
	}

}
