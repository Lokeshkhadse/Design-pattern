package org.example;

public class EmployeeFactory {

    public static Employee getEmp(EmployeeAbstractFactory factory){
        return factory.createEmployee();


    }
}
