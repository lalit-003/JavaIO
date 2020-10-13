package com_bridgelabz_IO;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import com_bridgelabz_IO.EmployeePayrollService.IOService;

public class TestingEmployeeService {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] empArray = {
				new EmployeePayrollData(1, "John", 100000),
				new EmployeePayrollData(2, "Jay", 250000),
				new EmployeePayrollData(3, "Roy", 300000)
		};
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(empArray));
		employeePayrollService.writeEmployeeData(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		System.out.println(entries);
		Assert.assertEquals(3, entries);		
	}
}
