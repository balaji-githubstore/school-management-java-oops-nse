package com.nse.groups;

import com.nse.base.Person;

public class Student extends Person {
	public int studentId;
	public double studentPercentage;
	public String courseCode;

	public void printCertification() {
		if (studentPercentage >= 70) {
			System.out.println(super.name + " is passed");
		} else {
			System.out.println(super.name + " is failed");
		}
	}
	
	public void displayPersonDetail()
	{
		System.out.println("Name "+super.name);
		System.out.println("Mobile Number: "+super.getMobileNumber());
		System.out.println("Student Percentage: "+studentPercentage);
		System.out.println("Course Code"+this.courseCode);
	}
}
