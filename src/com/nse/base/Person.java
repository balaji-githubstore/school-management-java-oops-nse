package com.nse.base;
//person
public abstract class Person {
	public String name;
	private int mobileNumber;
	public String address;
	public static String schoolName;
	public static String schoolAddress;

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {

		if (String.valueOf(mobileNumber).length() == 6) {
			this.mobileNumber = mobileNumber;
		} else {
			System.out.println("Provide six digit!!");
		}
	}
	
	public abstract void displayPersonDetail();

}
