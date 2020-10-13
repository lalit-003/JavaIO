package com_bridgelabz_IO;

import java.util.Scanner;

public class EmployeePayrollService {

	public static EmployeePayrollData readEmployeeData(Scanner sc) {
		System.out.println("Enter employee id(int) ");
		int employeeId = sc.nextInt();
		System.out.println("Enter employee salary(double) ");
		double salary = sc.nextDouble();
		System.out.println("Enter employee name(string) ");
		String name = sc.next();
		EmployeePayrollData employee = new EmployeePayrollData(employeeId, name, salary);
		return employee;
	}

	public static void writeEmployeeData(EmployeePayrollData displayEmployeeData) {
		System.out.println("\nWriting employee payroll data :\n" + displayEmployeeData);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeePayrollData emp = readEmployeeData(sc);
		writeEmployeeData(emp);
	}

}
