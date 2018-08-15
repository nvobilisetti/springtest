package com.nareen.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
	@Bean
	public Student newStudent() {
		Student s=new Student();
		s.setName("narendra");
		s.setStudDepartment("Computer science");
		StudentType st=new FullTimeStud();
				st.setStudType("full time");
		s.setStudentType(st);
		Address add=new AddressOne();
		add.setAddress("india");
		s.setStudAddr(add);	
		return s;
		
	}
	

}
