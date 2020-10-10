// Class: CSE 1321
// Section: 4
// Term: Fall 2020
// Instructor: Mokter Hossain, Ph.D.
// Name: Michael Lees

import java.util.Scanner;

// BEGIN MAIN
class Assignment2B {
  public static void main(String[] args) {
//     CREATE width, length, sqfeet, area, dots, Scanner
    Scanner scan = new Scanner(System.in);
    int width;
    int height;
    int length;
    int dotsqfeet;
    int area;
    float dots;
//     width = INPUT "Widget: "
    System.out.println("Width: ");
    width = scan.nextInt();
//     length = INPUT "Length: "
    System.out.println("Length: ");
    length = scan.nextInt();
//     dotsqfeet = INPUT "Square feet per dot: "
    System.out.println("Square feet per dot: ");
    dotsqfeet = scan.nextInt();
//     area = (width * length)
    area = (width * length);
//     dots = area / dotsqfeet
    dots = area / dotsqfeet;
//     PRINT "A yard of " + area + " square feet will take " + dots + " dots to cut."
    System.out.println("A yard of " + area + " square feet will take " + dots + " dots to cut.");
// END MAIN
  }
}
