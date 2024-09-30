package org.example;

public class Client {
    public static void main(String[] args) {


          Employee emp1=EmployeeFactory.getEmp(new JavaAbstractFactory());
            System.out.println(emp1.name());
        System.out.println(emp1.salary());


        System.out.println("--------------------------------------");


        Employee emp2=EmployeeFactory.getEmp(new PyAbstractFactory());
        System.out.println(emp2.name());
        System.out.println(emp2.salary());
        System.out.println("--------------------------------------");

        Employee emp3 =EmployeeFactory.getEmp(new ManagerAbstractFactory());
        System.out.println(emp3.salary());
        System.out.println(emp3.name());

    }
}
