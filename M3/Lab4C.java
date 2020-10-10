/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab4C
*/

import java.util.Scanner;

class Lab4C {
  public static void main(String[] args) {
    int choice;
    Scanner scan = new Scanner(System.in);
    System.out.println("Select from the following: ");
    System.out.println("To see a list of movies, press 1.");
    System.out.println("To see show times, press 2.");
    System.out.println("To pay your bill, press 3.");
    System.out.print("Choice: ");
    choice = scan.nextInt();
    if (choice == 1) {
      System.out.println("The Neverending Story 6");
      System.out.println("Princess Diaries: the untold story");
      System.out.println("Monty Python and the Programmer");
    }
    else if (choice == 2) {
      System.out.println("All movies play at 3PM.");
    }
    else if (choice == 3) {
      System.out.println("Corporate accounts payable, Nina speaking.");
      System.out.println("Just a moment!");
    }
    else {
      System.out.println("I'm sorry, Dave.  I can't do that.");
    }
  }
}
