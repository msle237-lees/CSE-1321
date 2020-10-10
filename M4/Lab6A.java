/*
Name: Michael Lees
Date: 09-21-2020
Professor:
Assignment: Lab6A
*/

import java.util.Scanner;

public class Lab6A {
  public static void main(String[] args) {
    String Keyword1 = "Cookie";
    String Keyword2 = "cookie";
    String input;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("Gimme a cookie: ");
      input = scan.nextLine();
    } while (!(input.equals(Keyword1) || input.equals(Keyword2)));
  }
}
