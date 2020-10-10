// Class: CSE 1321
// Section: 4
// Term: Fall 2020
// Instructor:
// Name: Michael Lees

import java.util.Scanner;

class Lab3A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int CCMoney;
    int CCAPR;
    int MPR;
    int minimumpayment;
    System.out.print("Amount owed: $");
    CCMoney = scan.nextInt();
    System.out.print("APR: ");
    CCAPR = scan.nextInt();
    System.out.print("Monthly percentage rate: ");
    MPR = scan.nextInt();
    minimumpayment = CCMoney * (CCAPR / 12);
    System.out.println("The Minimum Payment is: " + minimumpayment);
  }
}
