package org.example;

public class PyDev implements Employee{

    @Override
    public int salary() {
        System.out.println("py developer");
        return 1000000;
    }
}
