/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab4A
*/

import java.util.Scanner;

class Lab4A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the day: ");
    String day = scan.next();
    if (day.equals("Monday")) {
      System.out.println("Sounds like someone has a case of the Mondays!");
    }
    else if (day.equals("Tuesday")) {
      System.out.println("It's another day of the week.");
    }
    else if (day.equals("Wednesday")) {
      System.out.println("It's hump day! El ombligo!");
    }
    else if (day.equals("Thursday")) {
      System.out.println("Almost there!");
    }
    else if (day.equals("Friday")) {
      System.out.println("Finally.  It's Friday!");
    }
    else if (day.equals("Saturday")) {
      System.out.println("Party Time!!");
    }
    else if (day.equals("Sunday")) {
      System.out.println("It's another day of the week.");
    }
    else {
      System.out.println("I said a day of the week dumbass");
    }
  }
}
