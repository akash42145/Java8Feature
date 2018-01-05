package com.example.stream;

public class Address { 
	
	private String street;
	
	private String houseNo;
	
	private String country;
	private int pinCode;
	
	public Address() {
		super();
		
	}
		
	public Address(String street, String houseNo, String country, int pinCode) {
		super();
		this.street = street;
		this.houseNo = houseNo;
		this.country = country;
		this.pinCode = pinCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNo=" + houseNo + ", country=" + country + ", pinCode=" + pinCode
				+ "]";
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
