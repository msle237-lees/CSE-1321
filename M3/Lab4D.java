/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab4D
*/

import java.util.Scanner;

class Lab4D {
  public static void main(String[] args) {
    float gallons;
    float extragallons;
    float price1 = 15;
    float price2 = 25;
    float price3 = 35;
    float bill;
    Scanner scan = new Scanner(System.in);
    System.out.print("Gallons of water: ");
    gallons = scan.nextFloat();
    if (gallons <= 1000) {
      bill = (gallons * price1) / 100;
      System.out.println("Water bill is: $" + bill);
    }
    else if (gallons > 1000 && gallons < 2000) {
      extragallons = gallons - 1000;
      bill = ((extragallons * price2) + (1000 * price1)) / 100;
      System.out.println("Water bill is: $" + bill);
    }
    else if (gallons >= 2000) {
      extragallons = gallons - 2000;
      bill = ((extragallons * price3) + (1000 * price2) + (1000 * price1)) / 100;
      System.out.println("Water bill is: $" + bill);
    }
  }
}
