package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	public static void main(String[] args) {
		College obj=new College();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		Department obj2=new Department();
		obj2.deptName();
		Student obj3=new Student();
		obj3.studentDept();
		obj3.studentId();
		obj3.studentName();
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
