package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployee();
        System.out.println(allEmployees + "\n");

        Employee empById = communication.getEmployee(8);
        System.out.println(empById);

        Employee employee = new Employee("Svetlana", "Ozerova", "Sales", 1400);
        employee.setId(10);
        communication.saveEmployee(employee);

        communication.deleteEmployee(10);
    }
}
