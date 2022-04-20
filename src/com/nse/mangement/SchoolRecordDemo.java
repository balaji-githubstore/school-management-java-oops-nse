package com.nse.mangement;

import com.nse.base.Person;
import com.nse.groups.Professor;
import com.nse.groups.Student;

public class SchoolRecordDemo {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		stu1.studentId=101;
		stu1.name="John";
//		stu1.mobileNumber=788878787;
		stu1.address="#234, boston";
		stu1.courseCode="C101";
		stu1.studentPercentage=78.4;
		stu1.setMobileNumber(788888);
		
		stu1.printCertification();
		
		Student stu2=new Student();
		stu2.name="Mark";
		stu2.studentPercentage=50.2;
		
		stu2.printCertification();
		
		Professor pro1=new Professor();
		pro1.professorId=1001;
		pro1.name="Peter";
//		pro1.mobileNumber=78887;
		pro1.address="#45,kk";
		pro1.setMobileNumber(7455);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
	}
}
