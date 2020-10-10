/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Assignment3A
*/

import java.util.Scanner;

// MAIN
public class Assignment3A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//  CREATE Name1 (STRING)
    String Name1;
//  CREATE Name2 (STRING)
    String Name2;
    String Taylor = "Taylor";
    String Fernando = "Fernando";
//  PRINT "Enter guest 1: "
    System.out.print("Enter guest 1: ");
//  READ Name1
    Name1 = scan.nextLine();
//  PRINT "Enter guest 2: "
    System.out.print("Enter guest 2: ");
//  READ Name2
    Name2 = scan.nextLine();
//  IF (Name1 = "Taylor" AND Name2 = "Fernando") THEN
    if (Name1.equals(Taylor) && Name2.equals(Fernando)) {
//    PRINT "Your party is ruined and another bad pop song will be written."
      System.out.println("Your party is ruined and another bad pop song will be written.");
    }
//  ELSE IF (Name1 = "Fernando" AND Name2 = "Taylor") THEN
    else if (Name1.equals(Fernando) && Name2.equals(Taylor)) {
//    PRINT "Your party is ruined and another bad pop song will be written."
      System.out.println("Your party is ruined and another bad pop song will be written.");
    }
//  ELSE
    else {
//    PRINT "Your party was a hit!"
      System.out.println("Your party was a hit!");
    }
//  ENDIF
  }
}
// END MAIN
