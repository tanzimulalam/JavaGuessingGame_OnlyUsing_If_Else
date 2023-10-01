package com.project1;

import java.util.Scanner;

public class NewFeb14 {
    public static void main(String[] args) {
    	//Name: Md Tanzimul Alam Fahim
    	//Date:02/14/2023
    	//Project: Make a simple question answer game in Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Happy Valentines Day, Welcome to Fahim's Game");

        
        System.out.println("Think of an Animal, and I'll try to guess what it is.");
        System.out.println("Press Enter when you're ready to start.");
        scanner.nextLine();

     
        boolean foundAnswer = false;
        int questionNumber = 1;

        while (!foundAnswer && questionNumber <= 20) {
           
            System.out.println("Question " + questionNumber + ":");
            String answer = scanner.nextLine().toLowerCase();

            
            if (answer.equals("yes") || answer.equals("y")) {
          
                if (questionNumber == 1) {
                    System.out.println("Is it an Water Animal?");
                } else if (questionNumber == 2) {
                    System.out.println("Is it a Is it big?");
                } else if (questionNumber == 3) {
                    System.out.println("Is the animal blue or brown?");
                } else if (questionNumber == 4) {
                    System.out.println("Sounds amazing, does it have a tail");
                } else if (questionNumber == 5) {
                    System.out.println("Its getting harder, would you mind if I cant answer?");
                } else if (questionNumber == 6) {
                    System.out.println("Do you know about other animals?");
                    foundAnswer = true;
                    System.out.println("Nice knowing you user, welcome to UNCP and hope you have a great valentines day!");
                }
            } else if (answer.equals("no") || answer.equals("n")) {
             
                if (questionNumber == 1) {
                    System.out.println("Is it a Land Animal?");
                } else if (questionNumber == 2) {
                    System.out.println("Does the animal has a common color?");
                } else if (questionNumber == 3) {
                    System.out.println("Is the animal dangerous?");
                } else if (questionNumber == 4) {
                    System.out.println("Is the animal big?");
                } else if (questionNumber == 5) {
                    System.out.println("Is the animal small?");
                } else if (questionNumber == 6) {
                    System.out.println("Would you not be mad at me if I cant guess your animal?");
                    foundAnswer = true;
                    System.out.println("I appreciate your effort in this, hope you have a great valentines day!");
                }
            } else {
                // The user didn't answer "yes" or "no"
                System.out.println("I'm sorry, I didn't understand your answer. Please answer with \"yes\" or \"no\".");
            }

            questionNumber++;
        }

        if (!foundAnswer) {
            System.out.println("I couldn't guess your object. Thanks for playing!");
        }
    }
}
