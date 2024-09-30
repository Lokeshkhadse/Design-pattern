package org.example;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

              Samosa samo1 = Samosa.getsamosa();
               System.out.println(samo1.hashCode());

           Samosa samo2 = Samosa.getsamosa();
            System.out.println(samo2.hashCode());
//
//            Jalebi jalebi1 = Jalebi.getJalebi();
//        System.out.println(jalebi1.hashCode());
//
//        Jalebi jalebi2 = Jalebi.getJalebi();
//        System.out.println(jalebi2.hashCode());


        //break singleton pattern    1.by using constructor  2.use enum
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa samo2 = constructor.newInstance();
//        System.out.println(samo2.hashCode());

//        //Using Deserialization
//        Samosa samo4 = Samosa.getsamosa();
//        System.out.println(samo4.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new
//                FileOutputStream("abc.ob"));
//        oos.writeObject(samo4);
//
//        System.out.println("serialization done..");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//        System.out.println(s2.hashCode());


           //by using clone
//        Samosa s4 = (Samosa) samo1.clone();
//        System.out.println(s4.hashCode());
    }
}
