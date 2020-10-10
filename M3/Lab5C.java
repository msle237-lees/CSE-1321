/*
Name: Michael Lees
Lab: Lab5C
*/

import java.util.*;

public class Lab5C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter x: ");
    int X = scan.nextInt();
    System.out.print("Enter y: ");
    int Y = scan.nextInt();
    boolean origin = X == 0 && Y == 0;
    boolean Yaxis = X == 0 && (Y > 0 || Y < 0);
    boolean Xaxis = (X > 0 || X < 0) && Y == 0;
    boolean FirstQuad = X > 0 && Y > 0;
    boolean SecondQuad = X < 0 && Y > 0;
    boolean ThirdQuad = X < 0 && Y < 0;
    boolean FourthQuad = X > 0 && Y < 0;
    if (origin) {
      System.out.println("This point is the origin.");
    }
    else if (Yaxis) {
      System.out.println("This point is on the Y axis.");
    }
    else if (Xaxis) {
      System.out.println("This point is on the X axis.");
    }
    else if (FirstQuad) {
      System.out.println("This point is in the first quadrant.");
    }
    else if (SecondQuad) {
      System.out.println("This point is in the second quadrant.");
    }
    else if (ThirdQuad) {
      System.out.println("This point is in the third quadrant.");
    }
    else if (FourthQuad) {
      System.out.println("This point is in the fourth quadrant.");
    }
  }
}
