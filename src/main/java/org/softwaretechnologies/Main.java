package org.softwaretechnologies;

import org.softwaretechnologies.employee.EmployeeType;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ПЛЕМЗАВОД");
        company.addEmployee("Василий", 1000, EmployeeType.MANAGER);
        company.addEmployee("Вячеслав", 2000, EmployeeType.MANAGER);
        company.addEmployee("Петр II", 1000, EmployeeType.TESTER);
        company.addEmployee("Петр I", 1000, EmployeeType.PROGRAMMER);

        System.out.println(company.getMonthSalary(10));
    }
}
