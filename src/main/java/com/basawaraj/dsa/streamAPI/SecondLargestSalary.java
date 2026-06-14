package com.basawaraj.dsa.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargestSalary {

    static class Employee {
        Integer id;
        String name;
        Integer salary;

        Employee(Integer id, String name, Integer salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        Integer getSalary() {
            return this.salary;
        }

        public String toString() {
            return this.name;
        }
    }


    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Mike", 80000),
                new Employee(3, "David", 60000),
                new Employee(4, "Sam", 80000),
                new Employee(5, "Tom", 70000)
        );

        Optional<Integer> secondHighestSalary =
                employees.stream()
                        .map(Employee::getSalary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1).findFirst();

        List<Employee> list = employees.stream()
                .filter(e -> e.getSalary().equals(secondHighestSalary.orElse(0))).toList();
        System.out.println(secondHighestSalary.orElse(0) + " " + list);
    }

}
