package com.nse.groups;

import com.nse.base.Person;
//new change
public class Professor extends Person{
	public int professorId;
	public int departmentId;
	public String departmentName;
	public int experience;
	
	public void displayPersonDetail() {
		// TODO Auto-generated method stub
		System.out.println("Name "+super.name);
		System.out.println("Mobile Number: "+super.getMobileNumber());
		System.out.println("Name "+super.name);
		System.out.println("Mobile Number: "+this.professorId);
	} 

	
}
