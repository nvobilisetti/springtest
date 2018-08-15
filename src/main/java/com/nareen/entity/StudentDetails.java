package com.nareen.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDetails {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotctx = new AnnotationConfigApplicationContext(ConfigBean.class);
		
		Student stud=(Student)annotctx.getBean("newStudent");
		System.out.println("Student details are :"+stud.getName()+","+stud.getStudDepartment()+", "+stud.getStudentType()+", "+stud.getStudAddr());
		
	}

	public static void main1(String[] args) {
		
		ApplicationContext univContext=new ClassPathXmlApplicationContext("University.xml");
		Student stud=(Student) univContext.getBean("Stud2");
		System.out.println("Student details are :"+stud.getName()+","+stud.getStudDepartment()+", "+stud.getStudentType()+", "+stud.getStudAddr());
	
		University univ=(University) univContext.getBean("USF");
		System.out.println("University details :"+univ.getUnivName()+","+univ.getUnivAddr()+","+univ.getStudent());
		
	
	}
}
