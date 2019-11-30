package com.learning.test.model;

import java.util.*;

public class User {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + ", gender=" + gender
				+ ", created by=" + createdBy + ", created at=" + createdAt;
		// return super.toString();
	}

	private int id;
	private String name;
	private int age;
	private double weight;
	private char gender;
	private String createdBy;
	private String createdAt;

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date date) {
		this.createdAt = date.toString();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy() {
		this.createdBy = "System";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
