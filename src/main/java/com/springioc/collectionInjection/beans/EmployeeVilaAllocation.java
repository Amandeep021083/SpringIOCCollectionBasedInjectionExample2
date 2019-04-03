package com.springioc.collectionInjection.beans;

import java.util.Map;

public class EmployeeVilaAllocation {

	Map<Employee,Address> employeeVilaAllocation;

	public Map<Employee, Address> getEmployeeVilaAllocation() {
		return employeeVilaAllocation;
	}

	public void setEmployeeVilaAllocation(
			Map<Employee, Address> employeeVilaAllocation) {
		this.employeeVilaAllocation = employeeVilaAllocation;
	}

	@Override
	public String toString() {
		return "EmployeeVilaAllocation [employeeVilaAllocation="
				+ employeeVilaAllocation + "]";
	}
	
}
