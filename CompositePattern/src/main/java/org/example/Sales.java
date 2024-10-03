package org.example;

public class Sales implements Department{
    private int id;
    private String name;

    public Sales(int id , String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public void printDeptName() {
        System.out.println(getClass().getSimpleName());

    }
}
