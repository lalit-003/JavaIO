package com_bridgelabz_IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
	private static List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void readEmployeeData(Scanner sc) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		System.out.println("Enter employee id(int) ");
		int employeeId = sc.nextInt();
		System.out.println("Enter employee salary(double) ");
		double salary = sc.nextDouble();
		System.out.println("Enter employee name(string) ");
		String name = sc.next();
		employeePayrollService.readEmployeeData(sc);
//        employeePayrollService.writeEmployeeData();
        employeePayrollService.writeEmployeeData(IOService.FILE_IO);	}

//	public static void writeEmployeeData() {
//		System.out.println("\nWriting employee payroll data :\n" + employeePayrollList);
//	}


	public void writeEmployeeData(IOService serviceType) {
		if (serviceType == IOService.CONSOLE_IO)
			System.out.println("Writing Employee Payroll Roaster to console\n" + employeePayrollList);
		else if (serviceType == IOService.FILE_IO) {
			EmployeePayrollFileIOService  employeepayrollIO = new EmployeePayrollFileIOService();
			
		employeepayrollIO.writeData(employeePayrollList);
		}
	}
	
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		 readEmployeeData(sc);
//		writeEmployeeData();
//	}

}
