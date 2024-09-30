package org.example;

public class JavaAbstractFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new JavaDev();
    }
}
