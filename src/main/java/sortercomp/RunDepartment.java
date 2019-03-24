package main.java.sortercomp;

import java.util.*;

public class RunDepartment {

    public static void main(String[] args) {
        Employee e1 = new Employee("name e1");
        Employee e2 = new Employee("name e2");
        Employee e3 = new Employee("name e3");
        Collection<Employee> department = new ArrayList();

        department.add(e3);
        department.add(e2);
        department.add(e1);

        System.out.println("Before sort:");
        Employee.showDepartment(department);

        System.out.println("After sort:");
        Employee.showDepartment(Employee.sort(department));

        EmployeeWithComparable e4 = new EmployeeWithComparable("name e4");
        EmployeeWithComparable e5 = new EmployeeWithComparable("name e5");
        EmployeeWithComparable e6 = new EmployeeWithComparable("name e6");
        EmployeeWithComparable e7 = new EmployeeWithComparable("name e7");
        Collection<EmployeeWithComparable> departmentWithComparable = new ArrayList();

        departmentWithComparable.add(e5);
        departmentWithComparable.add(e6);
        departmentWithComparable.add(e4);
        departmentWithComparable.add(e7);

        System.out.println("Before sort:");
        EmployeeWithComparable.showDepartment(departmentWithComparable);

        System.out.println("After sort:");
        EmployeeWithComparable.showDepartment(EmployeeWithComparable.sort(departmentWithComparable));
    }
}

