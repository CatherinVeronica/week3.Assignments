package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegecode();
		obj.collegeRank();
		obj.deptName();
		obj.StudentName();
		obj.StudentDept();
		obj.StudentId();
	}
	public void StudentName() {
	System.out.println("Catherin");

	}
	
	public void StudentDept() {
		System.out.println("Biotech");

	}
	public void StudentId() {
		System.out.println("11467939");

	}

}
