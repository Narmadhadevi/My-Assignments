package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		}
	
	
	public void studentName() {
		System.out.println("Student name");
	}
	public void studentDept() {
		System.out.println("Student department");
	}
	public void studentId()	{
		System.out.println("Student id");
	}
	

}
