import java.util.Scanner;

class Lab9A {
  public static int max(int X, int Y, int Z) {
    int maxnumber = 0;
    if (X > maxnumber) {
      maxnumber = X;
    }
    if (Y > maxnumber) {
      maxnumber = Y;
    }
    if (Z > maxnumber) {
      maxnumber = Z;
    }
    return maxnumber;
  }
  public static int min(int X, int Y, int Z) {
    int minnumber = 10000;
    if (X < minnumber) {
      minnumber = X;
    }
    if (Y < minnumber) {
      minnumber = Y;
    }
    if (Z < minnumber) {
      minnumber = Z;
    }
    return minnumber;
  }
  public static double average(double X, double Y, double Z) {
    double average = (X + Y + Z) / 3;
    return average;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int X = scan.nextInt();
    System.out.print("Enter number 2: ");
    int Y = scan.nextInt();
    System.out.print("Enter number 3: ");
    int Z = scan.nextInt();
    int minnumber = min(X, Y, Z);
    System.out.println("Min is " + minnumber);
    int maxnumber = max(X, Y, Z);
    System.out.println("Max is " + maxnumber);
    double avnumber = average(X, Y, Z);
    System.out.println("Average is " + avnumber);
  }
}
