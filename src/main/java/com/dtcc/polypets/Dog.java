package com.dtcc.polypets;

public class Dog extends Pet{

    public Dog(String name){
        super(name);
    }

//    public Dog(String name, String speak){
//        super(name, speak);
//    }
    public String getSpeak(){
        String speak = "BorKkk, Borkkk";
        return speak;
    }
}
