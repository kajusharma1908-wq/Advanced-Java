import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Stream3 {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Gunjan", 50000),
            new Employee("Kajal", 70000),
            new Employee("Ishika", 80000),
            new Employee("Daisy", 55000)
        );

        list.stream()
            .filter(emp -> emp.salary > 60000)   
            .map(emp -> emp.name.toUpperCase()) 
            .forEach(System.out::println);
    }
}