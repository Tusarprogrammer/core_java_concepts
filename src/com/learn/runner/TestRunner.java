package com.learn.runner;

import com.learn.bean.Student;

public class TestRunner {

	public static void main(String[] args) {
		Student studentObject = new Student();
		studentObject.setId(1);
		studentObject.setName("Student1");
		studentObject.setMobileNo(123456);
		System.out.println("Student id - "+studentObject.getId() + " Student name - " +studentObject.getName() + " Student mobile no - " +studentObject.getMobileNo());
	}

}
