import java.util.Scanner;
import java.lang.Math;

class Lab3C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float quarters, dimes, nickels, pennies, total, coins;
    System.out.print("Enter the number of quarters: ");
    quarters = scan.nextInt();
    System.out.print("Enter the number of dimes: ");
    dimes = scan.nextInt();
    System.out.print("Enter the number of nickels: ");
    nickels = scan.nextInt();
    System.out.print("Enter the number of pennies: ");
    pennies = scan.nextInt();
    total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies);
    coins = total % 100;
    float convertedamount = total / 100;
    int quartersconv = (int) quarters;
    int dimesconv = (int) dimes;
    int nickelsconv = (int) nickels;
    int penniesconv = (int) pennies;
    int bills = (int) convertedamount;
    int coinamount = (int) coins;
    System.out.println("You entered " + quartersconv + " quarters.");
    System.out.println("You entered " + dimesconv + " dimes.");
    System.out.println("You entered " + nickelsconv + " nickels.");
    System.out.println("You entered " + penniesconv + " pennies.");
    System.out.println("Your total is " + bills + " dollars and " + coinamount + " cents.");
  }
}
