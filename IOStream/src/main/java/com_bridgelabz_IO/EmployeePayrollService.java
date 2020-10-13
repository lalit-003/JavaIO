package com_bridgelabz_IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
	private static List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void readEmployeeData(Scanner sc) {
		System.out.println("Enter employee id(int) ");
		int employeeId = sc.nextInt();
		System.out.println("Enter employee salary(double) ");
		double salary = sc.nextDouble();
		System.out.println("Enter employee name(string) ");
		String name = sc.next();
		EmployeePayrollData employee = new EmployeePayrollData(employeeId, name, salary);
		employeePayrollList.add(employee);
	}

	public static void writeEmployeeData() {
		System.out.println("\nWriting employee payroll data :\n" + employeePayrollList);
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner sc = new Scanner(System.in);
		 readEmployeeData(sc);
		writeEmployeeData();
	}

}
