package com.dtcc.polypets;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PetTest{

    @Test
    public void dogTest(){
        //Create instance of dog
        Dog dog = new Dog("Dog");
        //Check forced name, technically checking getName
        assertEquals("Dog", dog.getName());
        //Default speak
        assertEquals("BorKkk, Borkkk", dog.getSpeak());
    }

    @Test
    public void catTest(){
        Cat cat = new Cat("Puss");
        assertEquals("Puss", cat.getName());
        assertEquals("Meow, what is so funny.", cat.getSpeak());
    }

    @Test
    public void humanTest(){
      Human human = new Human("Cedric");
        assertEquals("Cedric", human.getName());
        assertEquals("Please free me, please", human.getSpeak());
    }
}
