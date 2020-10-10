/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab4B
*/

import java.util.Scanner;

class Lab4B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Number of hours this week: ");
    int hours = scan.nextInt();
    int overtimepay = 25;
    int payperhour = 15;
    int overtime;
    int payforovertime;
    int payfor40;
    int pay;
    if (hours > 40) {
      overtime = hours - 40;
      payforovertime = overtimepay * overtime;
      payfor40 = payperhour * 40;
    }
    else {
      payfor40 = hours * payperhour;
      payforovertime = 0;
    }
    pay = payfor40 + payforovertime;
    System.out.println("Earnings: $" + pay);
  }
}
