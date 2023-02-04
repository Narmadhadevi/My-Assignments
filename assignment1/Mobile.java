package week1.assignment1;

public class Mobile {
public void makeCall() {
	String mobileModel="oppo f9 pro";
	float mobileWeight=4.67f;
	System.out.println("Mobile is "+mobileModel);
	System.out.println("Mobile weight is "+mobileWeight);
}
public void sendMsg() {
	boolean isFullyCharged=true;
	int mobileCost=22000;
	System.out.println("Is mobile fully charged? "+isFullyCharged);
	System.out.println("Mobile cost is "+mobileCost);
}
public static void main(String[] args) {
	Mobile call=new Mobile();
	call.makeCall();
	call.sendMsg();
	System.out.println("This is my mobile");
}
}
