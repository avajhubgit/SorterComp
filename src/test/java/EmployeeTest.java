package test.java;

import main.java.sortercomp.Employee;
import main.java.sortercomp.EmployeeUtils;
import main.java.sortercomp.EmployeeWithComparable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeTest {

    @Test
    public void employeeWithComparableSortTest() {
        EmployeeWithComparable e4 = new EmployeeWithComparable("name e4");
        EmployeeWithComparable e5 = new EmployeeWithComparable("name e5");
        EmployeeWithComparable e6 = new EmployeeWithComparable("name e6");
        EmployeeWithComparable e7 = new EmployeeWithComparable("name e7");
        Collection<EmployeeWithComparable> collection = new ArrayList();

        collection.add(e5);
        collection.add(e6);
        collection.add(e4);
        collection.add(e7);

        System.out.println("Before sort:");
        EmployeeWithComparable.showCollection(collection);

        System.out.println("After sort:");
        EmployeeWithComparable.showCollection(EmployeeWithComparable.sort(collection));
    }

    @Test
    public void employeeSortEmptyTest() {
        Collection<Employee> collection = new ArrayList();

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(collection));
    }

    @Test
    public void employeeSortCheckNPETest() {
        Collection<Employee> collection = new ArrayList();

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(null));
    }

    @Test(expected = NullPointerException.class)
    public void employeeSortCheckNPETest1() {
        System.out.println("Before sort:");
        EmployeeUtils.showCollectionWithoutNPECheck(null);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(null));
    }

    @Test
    public void employeeSortTest() {
        Employee e1 = new Employee("name e1");
        Employee e2 = new Employee("name e2");
        Employee e3 = new Employee("name e3");
        Collection<Employee> collection = new ArrayList();

        collection.add(e3);
        collection.add(e2);
        collection.add(e1);

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(collection));
    }

    @Test
    public void employeeSortPairCountTest() {
        Employee e1 = new Employee("name e1");
        Employee e2 = new Employee("name e2");
        Employee e3 = new Employee("name e3");
        Employee e4 = new Employee("name e4");
        Collection<Employee> collection = new ArrayList();

        collection.add(e4);
        collection.add(e3);
        collection.add(e2);
        collection.add(e1);

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(collection));
    }

    @Test
    public void employeeSortNotPairCountTest() {
        Employee e1 = new Employee("name e1");
        Employee e2 = new Employee("name e2");
        Employee e3 = new Employee("name e3");
        Employee e4 = new Employee("name e4");
        Employee e5 = new Employee("name e5");
        Collection<Employee> collection = new ArrayList();

        collection.add(e4);
        collection.add(e3);
        collection.add(e5);
        collection.add(e2);
        collection.add(e1);

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(collection));
    }

    @Test
    public void employeeSortWithDuplicateTest() {
        Employee e1 = new Employee("name e1");
        Employee e2 = new Employee("name e2");
        Employee e3 = new Employee("name e3");
        Employee e4 = new Employee("name e1");
        Employee e5 = new Employee("name e2");
        Employee e6 = new Employee("name e3");
        Employee e7 = new Employee("name e1");
        Employee e8 = new Employee("name e2");
        Employee e9 = new Employee("name e2");

        Collection<Employee> collection = new ArrayList();

        collection.add(e3);
        collection.add(e2);
        collection.add(e1);
        collection.add(e4);
        collection.add(e6);
        collection.add(e5);
        collection.add(e7);
        collection.add(e8);
        collection.add(e9);

        System.out.println("Before sort:");
        EmployeeUtils.showCollection(collection);

        System.out.println("After sort:");
        EmployeeUtils.showCollection(EmployeeUtils.sort(collection));
    }

}
