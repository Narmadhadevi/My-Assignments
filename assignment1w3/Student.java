package week3.assignment1w3;

public class Student {
public void getStudentInfo(int id) {
	System.out.println("The id of student is "+id);
}
public void getStudentInfo(int id,String name) {
	System.out.println("The name of student "+name+" of id "+id);
}
public void getStudentInfo(String email,String phoneNo) {
System.out.println("The email and phoneNo are "+email+" and "+phoneNo); 
}
public static void main(String[] args) {
	Student obj=new Student();
	obj.getStudentInfo(123);
	obj.getStudentInfo(123, "Mahesh");
	obj.getStudentInfo("mawa@gmail.com","9597219926");
}
}
