package com.example.stream;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class User {
	
	private int id;
	
	private String name;
	
	private String email;
	
	private Address address;
	
	private List<Integer> accounts;
	public User(int id, String name, String email, Address address, List<Integer> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.accounts = accounts;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Integer> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Integer> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", accounts="
				+ accounts + "]";
	}
	
	public String[] stringArr(){
		return new String[]{ "Life  "," is ","Boring "	};
	
	}
	
}
