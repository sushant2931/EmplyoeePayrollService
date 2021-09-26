package com.bridegelabz.payrollservice;

import java.util.Arrays;


import com.bridgelabz.payrollservice.EmployeePayrollData;
import com.bridgelabz.payrollservice.EmployeePayrollService;
import org.junit.Test;

public class EmployeePayrollServiceTest {

        @Test
        public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries()
        {
            EmployeePayrollData[] arrayOfEmployees = {
                    new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
                    new EmployeePayrollData(2, "Bill Gates", 200000.0),
                    new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0)
            };
            EmployeePayrollService employeePayrollService;
            employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
            employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);

        }
}
