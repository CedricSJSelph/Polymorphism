package com.dtcc.polypets;

import java.util.Scanner;

public class PetFactory {

    public void userInput(){

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome, How many pets do you have? : ");
        int numOfPets = input.nextInt();
        input.nextLine();

        Pet[] petList = new Pet[numOfPets];

        for(int i = 0; i < numOfPets; i++){

            System.out.print("What kind of pet are they? : ");
            String typeOfPet = input.nextLine();
            System.out.println();

            System.out.print("What is their name? : ");
            String nameOfPet = input.nextLine();
            System.out.println();

            if (typeOfPet.equalsIgnoreCase("Dog")) {
                petList[i] = new Dog(nameOfPet);
            }else if (typeOfPet.equalsIgnoreCase("Cat")){
                petList[i] = new Cat(nameOfPet);
                //Cow for yall
            }else if (typeOfPet.equalsIgnoreCase("Human")) {
                petList[i] = new Human(nameOfPet);
            }
        }

        for(int j = 0; j < numOfPets; j++){
            System.out.println(petList[j].getName() + " says: " + petList[j].getSpeak());
        }
    }
}
