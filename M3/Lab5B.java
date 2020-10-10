/*
Name: Michael Lees
Lab: Lab5B
*/

import java.util.*;

public class Lab5B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
    int day = scan.nextInt();
    System.out.print("Enter the number of days until the meeting: ");
    int days_till_meeting = scan.nextInt();
    if (days_till_meeting > 6) {
      days_till_meeting = (day + days_till_meeting) % 7;
    }
    List<String> days_of_week = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    // System.out.println(days_till_meeting);
    System.out.println("Meeting day is " + days_of_week.get(days_till_meeting));
  }
}
/*
Sunday = 0
Monday = 1
Tuesday = 2
Wednesday = 3
Thursday = 4
Friday = 5
Saturday = 6
*/
