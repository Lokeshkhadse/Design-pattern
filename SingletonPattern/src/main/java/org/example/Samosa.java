package org.example;

import java.io.Serializable;

public class Samosa /*implements Serializable ,Cloneable*/{

    //lazy way
    private static  Samosa samo;

    private Samosa(){
//        if(samo!= null){     ////break singleton pattern
//            throw new RuntimeException("you are trying to break pattern");
//        }

    }

    public static Samosa getsamosa(){
        if(samo  == null){
            synchronized (org.example.Samosa.class){
                if(samo == null){
                    samo = new Samosa();
                }
            }
        }
        return samo;
    }

   //BREAING RESOLVE (SERIALIZE)
//    public Object readResolve(){
//        return samo;
//    }

//    //using clone resolve
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return samo;
//    }


}
