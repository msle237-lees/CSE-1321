/*
Name: Michael Lees
Date: 9/15/2020
Lab: Lab5
*/

import java.util.Scanner;

public class Lab5A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char question1;
    char question2;
    System.out.print("Experiencing severe symptoms (Y/N)? ");
    question1 = scan.next().charAt(0);
    if (question1 == 'Y' || question1 == 'y') {
      System.out.println("Seek Emergency care.");
    }
    else {
      System.out.print("Close contact with someone who has COVID (Y/N)? ");
      question2 = scan.next().charAt(0);
      if (question2 == 'Y' || question2 == 'y') {
        System.out.println("Quarantine and get tested if you feel sick.");
      }
      else {
        System.out.println("If you experience other symptoms, isolate and get tested.");
      }
    }
  }
}
