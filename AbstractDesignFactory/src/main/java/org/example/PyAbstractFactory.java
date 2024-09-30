package org.example;

public class PyAbstractFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new PyDev();
    }
}
