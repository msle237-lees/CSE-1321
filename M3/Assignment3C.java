/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Assignment3C
*/

import java.util.*;

// MAIN
public class Assignment3C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//   CREATE PartySize (Float)
    float PartySize;
//   CREATE BillCost  (Float)
    float BillCost;
//   CREATE PercentageIncrease (Float)
    float PercentageIncrease;
//   CREATE FinalBill (Float)
    float FinalBill;
//   CREATE Question (Char)
    char Question;
//   CREATE Tip (INT)
    float Tip;
//   CREATE FinalCost (INT)
    float FinalCost;
//   PRINT "How many people in your party? "
    System.out.print("How many people in your party? ");
//   READ PartySize
    PartySize = scan.nextFloat();
//   PRINT "What is the total cost of your bill? "
    System.out.print("What is the total cost of your bill? ");
//   READ BillCost
    BillCost = scan.nextFloat();
//   IF (PartySize > = 6) THEN
    if (PartySize >= 6) {
//     PercentageIncrease = (BillCost * 18) / 100
      PercentageIncrease = (BillCost * 18) / 100;
    }
//   ELSE
    else {
//     PercentageIncrease = 0
      PercentageIncrease = 0;
//   ENDIF
    }
//   FinalBill = BillCost + PercentageIncrease
    FinalBill = BillCost + PercentageIncrease;
//   PRINT "Your bill is $" + FinalBill
    System.out.println("Your bill is " + FinalBill);
//   PRINT "Would you like to include an additional tip (Y/N)? "
    System.out.print("Would you like to include an additional tip (Y/N)? ");
//   READ Question
    Question = scan.next().charAt(0);
//   IF (Question = Y) THEN
    if (Question == 'Y' || Question == 'y') {
//     PRINT "How much? "
      System.out.print("How much? ");
//     READ Tip
      Tip = scan.nextFloat();
    }
//   ELSE
    else {
//     Tip = 0
      Tip = 0;
//   ENDIF
    }
//   FinalCost = FinalBill + Tip
    FinalCost = FinalBill + Tip;
//   PRINT "Total bill is: $" + FinalCost
    System.out.println("Total bill is: " + FinalCost);
// END MAIN
  }
}
