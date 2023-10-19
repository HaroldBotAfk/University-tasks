package org.softwaretechnologies;

import org.softwaretechnologies.employee.*;

import java.time.LocalDate;
import java.time.YearMonth;

public class EmployeeFactory {

    /**
     * Сначала создайте классы, наследуемые от  {@link  org.softwaretechnologies.employee.Employee Employee} для каждого из значений в EmployeeType.
     * Функция должна создавать и возвращать Employee нужного типа. Тип зависит от значения параметра type.
     * name имя сотрудника
     * baseSalary базовая зарплата сотрудника
     * type тип сотрудника
     *
     * @return созданного сотрудника нужного типа. Тип зависит от параметра type.
     */

    static class Manager extends Employee {
        private EmployeeType type;

        public Manager(String name, int baseSalary) {
            super(name, baseSalary);
            type = EmployeeType.MANAGER;
        }

        @Override
        public int getMonthSalary(int month) {
            int monthSalary = 0;
            if (month % 2 == 0) {
                monthSalary = baseSalary;
            } else {
                monthSalary = baseSalary / 2;
            }
            return monthSalary;
        }
    }

    static class Programmer extends Employee {
        private EmployeeType type;

        public Programmer(String name, int baseSalary) {
            super(name, baseSalary);
            type = EmployeeType.PROGRAMMER;
        }

        @Override
        public int getMonthSalary(int month) {
            return baseSalary;
        }
    }

    static class Tester extends Employee {
        private EmployeeType type;

        public Tester(String name, int baseSalary) {
            super(name, baseSalary);
            type = EmployeeType.TESTER;
        }

        @Override
        public int getMonthSalary(int month) {
            return baseSalary * YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth();
        }
    }


    public static Employee createEmployee(String name, int baseSalary, EmployeeType type) {
        Employee employee;
        switch (type) {
            case MANAGER -> employee = new Manager(name, baseSalary);
            case PROGRAMMER -> employee = new Programmer(name, baseSalary);
            case TESTER -> employee = new Tester(name, baseSalary);
            default -> employee = null;
        }

        return employee;
    }
}
