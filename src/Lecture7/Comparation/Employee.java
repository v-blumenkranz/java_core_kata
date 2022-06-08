package Lecture7.Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    double salary;

    public Employee(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;

        } else {
            return 0;
        }
        //return this.id - anotherEmp.id; //другой способ написания этого метода

        //также для сравнения можно использовать методы compareTo, переопределенные в классах,
        //имплементирующих интерфейс Comparable
        //return this.id.compareTo(anotherEmp.id); - разумеется, id должен быть Integer
    }
}

class Test{
    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();
        Employee emp1 = new Employee(12345, "Валерия", "Яровцева", 100.50);
        Employee emp2 = new Employee(12343, "Алексей", "Блюменкранц", 300.50);
        Employee emp3 = new Employee(12347, "Ириска", "Татьяновна", 00.50);
        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        System.out.println(listOfEmployees);
        Collections.sort(listOfEmployees);
        System.out.println(listOfEmployees);

    }
}