/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Assignment3B
*/

import java.util.Scanner;

// MAIN
public class Assignment3B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//   CREATE Num1 (INT)
    int Num1;
//   CREATE Num2 (INT)
    int Num2;
//   CREATE Answer (INT)
    int Answer = 0;
//   CREATE Operator (STRING)
    char Operator;
//   PRINT "Enter the first number: "
    System.out.print("Enter the first number: ");
//   READ Num1
    Num1 = scan.nextInt();
//   PRINT "Enter the second number: "
    System.out.print("Enter the second number: ");
//   READ Num2
    Num2 = scan.nextInt();
//   PRINT "Enter the operator to apply: "
    System.out.print("Enter the operator to apply: ");
//   READ Operator
    Operator = scan.next().charAt(0);
 // SWITCH (Operator)
    switch (Operator) {
//   CASE "+":
    case '+':
//     Answer = Num1 + Num2
      Answer = Num1 + Num2;
      break;
//   CASE "-":
    case '-':
//     ANSWER = Num1 - Num2
      Answer = Num1 - Num2;
      break;
//   CASE "*":
    case '*':
//     ANSWER = Num1 * Num2
      Answer = Num1 * Num2;
      break;
//   CASE "/":
    case '/':
//     ANSWER = Num1 / Num2
      Answer = Num1 / Num2;
      break;
    }
//   PRINT Answer
    System.out.println(Answer);
  }
}
// END MAIN
