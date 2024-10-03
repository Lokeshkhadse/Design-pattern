package org.example;

public class Financial implements Department{

    private int id;
    private String name;

    public Financial(int id , String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public void printDeptName() {
        System.out.println(getClass().getSimpleName());

    }
}
