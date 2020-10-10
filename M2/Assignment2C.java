// Class: CSE 1321
// Section: 4
// Term: Fall 2020
// Instructor: Mokter Hossain, Ph.D.
// Name: Michael Lees

import java.util.Scanner;

// BEGIN MAIN
class Assignment2C {
public static void main(String[] args) {
//  CREATE diagpixels, ppi, horizonpixels, verticalpixels, diaglength, scan
  Scanner scan = new Scanner(System.in);
  double diagpixels, ppi, horizonpixels, verticalpixels, diaglength;

//  horizonpixels = INPUT "Horizontal pixels: "
  System.out.println("Horizontal pixels: ");
  horizonpixels = scan.nextInt();
//  verticalpixels = INPUT "Vertical pixels: "
  System.out.println("Vertical pixels: ");
  verticalpixels = scan.nextInt();
//  diaglength = INPUT "Diagonal length in inches: "
  System.out.println("Diagonal length in inches: ");
  diaglength = scan.nextInt();
//  diagpixels = Square root of ((verticalpixels^2) + (horizonpixels^2))
  double squaredverticalpixels = verticalpixels * verticalpixels;
  double squaredhorizonpixels = horizonpixels * horizonpixels;
  double squareddiagpixels = squaredverticalpixels + squaredhorizonpixels;
  diagpixels = Math.sqrt(squareddiagpixels);
//  ppi = diagpixels / diaglength
  ppi = diagpixels / diaglength;
  int cppi = (int) ppi;
  //  PRINTLINE "Pixels per inch: " + ppi
      System.out.println("Pixels per inch: " + cppi);
// END MAIN
}
}
