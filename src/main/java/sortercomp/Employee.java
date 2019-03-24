package main.java.sortercomp;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public static NavigableSet<Employee> sort(Collection<Employee> department) {
        NavigableSet<Employee> s = new TreeSet(new SortByName());
        for (Employee emp : department) {
            s.add(emp);
        }
        return s;
    }

    public static void showDepartment(Collection<Employee> department) {
        String result = department.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);
    }
}

