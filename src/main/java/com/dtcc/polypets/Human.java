package com.dtcc.polypets;

public class Human extends Pet {

    public Human(String name){
        super(name);
    }

//    public Human(String name, String speak){
//        super(name, speak);
//    }
    public String getSpeak(){
        String speak = "Please free me, please";
        return speak;
    }
}
