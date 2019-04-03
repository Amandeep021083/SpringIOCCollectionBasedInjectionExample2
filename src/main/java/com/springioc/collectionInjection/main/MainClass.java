package com.springioc.collectionInjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.collectionInjection.beans.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		user.getCars().stream().forEach(System.out::println);
	}

}
