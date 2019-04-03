package com.springioc.collectionInjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.collectionInjection.beans.EmployeeVilaAllocation;

public class MainClass2 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		EmployeeVilaAllocation employeeVilaAllocation = (EmployeeVilaAllocation)context.getBean("employeeVilaAllocation");
		System.out.println(employeeVilaAllocation);
	}

}
