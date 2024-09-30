package org.example;

public class JavaDev implements Employee{
    @Override
    public int salary() {
        return 500000;
    }

    @Override
    public String name() {
        System.out.println("JavaDevleoper");
        return "JavaDev";
    }
}
