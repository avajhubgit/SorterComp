package main.java.sortercomp;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeWithComparable implements Comparable {
    private String name;

    public String getName() {
        return name;
    }

    public EmployeeWithComparable(String name) {
        this.name = name;
    }

    public static void showDepartment(Collection<EmployeeWithComparable> department) {
        String result = department.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return 1;
        EmployeeWithComparable emp = (EmployeeWithComparable) o;
        return this.getName().compareTo(emp.getName());
    }

    public static NavigableSet<EmployeeWithComparable> sort(Collection<EmployeeWithComparable> department) {
        NavigableSet<EmployeeWithComparable> s = new TreeSet(department);
        return s;
    }
}
