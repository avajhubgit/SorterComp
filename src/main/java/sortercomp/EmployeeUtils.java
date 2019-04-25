package main.java.sortercomp;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static NavigableSet<Employee> sort(Collection<Employee> collection) {
        if (collection != null) {
            NavigableSet<Employee> s = new TreeSet(new SortByName());
            s.addAll(collection);
            return s;
        }
        return null;
    }

    public static void showCollection(Collection<Employee> collection) {
        if (collection != null) {
            String result = collection.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.joining(", ", "{", "}"));
            System.out.println(result);
        }
    }

    public static void showCollectionWithoutNPECheck(Collection<Employee> collection) {
        String result = collection.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);
    }

}
