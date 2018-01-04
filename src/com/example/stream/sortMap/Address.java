package com.example.stream.sortMap;

public class Address {
	private int houseNo;
	private String country;
	private Integer pin;
	
	
	public Address(int houseNo, String country, int pin) {
		super();
		this.houseNo = houseNo;
		this.country = country;
		this.pin = pin;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", country=" + country + ", pin=" + pin + "]";
	}
}
