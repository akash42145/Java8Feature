package com.example.stream.practice1;

public class Student {	
	private String name;
    private int age;
    private Country country;
    private int score;
    
	public Student(String name, int age, Country country, int score) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Country getCountry() {
		return country;
	}

	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setScore(int score) {
		this.score = score;
	}


}
