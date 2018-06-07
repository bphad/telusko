package com.telusko.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.telusko.model.Account;

public class Student {
	private int id;
	private String name;
	private String age;
	private String marks;
	private String city;

	private Account account;

	public Account getAccount() {
		return account;
	}

	@Autowired
	public void setAccount(Account account) {
		this.account = account;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Student> getStudents() {
		return account.getStudents();
	}

	public List<Student> getStudent1() {
		return account.getStudent1();

	}

	public List<Student> getStudent2() {
		return account.getStudent2();
	}

	public List<Student> getStudent3() {
		return account.getStudent3();
	}
}
