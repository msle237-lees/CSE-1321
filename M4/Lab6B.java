/*
Name: Michael Lees
Date: 09-21-2020
Professor:
Assignment: Lab6B
*/

import java.util.Scanner;

public class Lab6B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number between -1000 and +1000: ");
    int input = scan.nextInt();
    int max = input;
    int min = input;
    System.out.println("Min is " + min);
    System.out.println("Max is " + max);
    while (input != 0) {
      System.out.print("Enter a number between -1000 and +1000: ");
      input = scan.nextInt();
      if (input > max) {
        max = input;
      }
      else if (input < min) {
        min = input;
      }
      System.out.println("Min is " + min);
      System.out.println("Max is " + max);
    }
  }
}
