package com_bridgelabz_IO;

public class EmployeePayrollData {
	
	int id;
	String name ;
	double salary;
	
	public EmployeePayrollData(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
        @Override
        public String toString()
        {
        	return "id is : "+ id +", name is : " + name +", salary is : "+salary;        }
	
}
