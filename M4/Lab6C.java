/*
Name: Michael Lees
Date: 09-21-2020
Professor:
Assignment: Lab6C
*/

import java.util.Scanner;

public class Lab6C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    int sum = 0;
    System.out.print("Enter a starting number: ");
    num1 = scan.nextInt();
    System.out.print("Enter an ending number: ");
    num2 = scan.nextInt();
    // System.out.println("num1 = " + num1 + " and num2 = " + num2);
    if (num1 > num2) {
      // If num1 is greater than num2 we have to the sum of the odd numbers in reverse
      if (num2 % 2 == 0){
        num2++;
      }
      for (int i = num2; i <= num1; i += 2) {
        sum = sum + i;
      }
      System.out.println("Sum of odds is: " + sum);
    }
    else {
      // If num1 is less than num2 we do it normally
      if (num1 % 2 == 0) {
        num1++;
      }
      for (int i = num1; i <= num2; i += 2) {
        sum = sum + i;
      }
      System.out.println("Sum of odds is: " + sum);
    }
  }
}
