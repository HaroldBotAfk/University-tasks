package org.softwaretechnologies.employee;

import java.time.LocalDate;
import java.time.YearMonth;

/**
 * Тип сотрудника
 */
public enum EmployeeType {
    /*
    Формула вычисления зп: если месяц четный, то baseSalary, иначе baseSalary/2
     */
    MANAGER{

    },

    /*
    Формула вычисления зп: всегда baseSalary
     */
    PROGRAMMER{

    },
    /*
    Формула вычисления зп: baseSalary * количество дней в месяце в текущем году
    Вычисление количества дней в месяце: YearMonth.of(LocalDate.now().getYear(), month).lengthOfMonth()
     */
    TESTER{

    };

}
