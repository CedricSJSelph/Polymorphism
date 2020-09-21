package com.dtcc.polypets;
import java.util.*;

public class Pet {

    private String name;
//    private String speak;

    public Pet(String name){
        this.name = name;
    }

    //Name getters
    public String getName(){
        return name;
    }

    public String getSpeak(){
        //return speak;
        return "i'm a mute";
    }

//class basicPets extends Pet{
//ArrayList<String> pets = new ArrayList<String>();
//    public static void main(String[] args){
//        int z = 0;
//        Scanner input = new Scanner(System.in);
//
//        ArrayList<String> pets = new ArrayList<String>();
//
//        System.out.print("How Many pets do you have: ");
//        int number_of_Pets = input.nextInt();
//        System.out.println();
//
//        for(int i = 0; i < number_of_Pets; i++){
//
//            System.out.print("What is pet #" + (i+1) + " type? : ");
//            pets.add(input.next());
//            System.out.println();
//
//            System.out.print("What is pet #" + (i+1) + " name? : ");
//            pets.add(input.next());
//            System.out.println();
//        }
//
//        input.close();
//
//        while( z < pets.size()){
//            System.out.println("Your " + pets.get(z) + " is named " + pets.get(z+1));
//            z+=2;
//        }
//    }
}
