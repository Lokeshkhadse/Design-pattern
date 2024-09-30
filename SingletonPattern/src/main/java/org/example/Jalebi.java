package org.example;

public class Jalebi {

    //eager way
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
