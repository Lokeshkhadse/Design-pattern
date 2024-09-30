package org.example;

public class Client
{
    public static void main( String[] args )
    {

        Employee emp = EmployeeFactory.getEmp("JAVA DEVELOPER");
        System.out.println(emp);
        System.out.println(emp.salary());

        Employee emp1 = EmployeeFactory.getEmp("PY DEVELOPER");
        System.out.println(emp1);
        System.out.println(emp1.salary());
    }
}
