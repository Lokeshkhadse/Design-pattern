package org.example;

public class ManagerAbstractFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
