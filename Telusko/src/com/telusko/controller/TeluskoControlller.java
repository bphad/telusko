package com.telusko.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.beans.Student;

@Controller
public class TeluskoControlller {
	@Autowired
	private Student student;
	@RequestMapping("/")
	public String showIndex(HttpSession session) {
		List<Student> list = student.getStudents();
		session.setAttribute("list", list);
		return "index";
	}
	@RequestMapping("/Show-10-20")
	public String showS1(HttpSession session){
		List<Student> list1 = student.getStudent1();
		session.setAttribute("list1", list1);
		return "10-20";
	}
	@RequestMapping("/Show-20-30")
	public String showS2(HttpSession session){
		List<Student> list2 = student.getStudent2();
		session.setAttribute("list2", list2);
		return "20-30";
	}
	@RequestMapping("/Show-30-40")
	public String showS3(HttpSession session){
		List<Student> list3 = student.getStudent3();
		session.setAttribute("list3", list3);
		return "30-40";
	}
}
