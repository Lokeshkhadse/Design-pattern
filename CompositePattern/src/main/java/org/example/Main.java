package org.example;

//question:- department(sales ,financial) head dep (list of department(add, remove dept)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department financial = new Financial(1, "finance");
        Department sales = new Sales(2, "Sales");

        HeadDepartment headDepartment = new HeadDepartment(3 ,"Head");

        headDepartment.addDepartment(sales);
        headDepartment.addDepartment(financial);

        headDepartment.printDeptName();
        System.out.println("--------------------------------");
        
        headDepartment.removeDepartment(financial);
        headDepartment.printDeptName();
    }
}