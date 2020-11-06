import java.util.*;
public class Assignment6B {
  public static String season(int month, int day) {
    int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    int dayspast = 0;
    for (int i = 0; i < month; i++) {
      dayspast += daysInMonth[i];
    }
    dayspast += day;
    String seas = ".";
    if ((79 <= dayspast) && (dayspast <= 171)) {
      seas = "Spring";
    }
    if ((172 <= dayspast) && (dayspast <= 265)) {
      seas = "Summer";
    }
    if ((266 <= dayspast) && (dayspast <= 355)) {
      seas = "Fall";
    }
    if ((356 <= dayspast) && (dayspast <= 366)) {
      seas = "Winter";
    }
    if ((0 <= dayspast) && (dayspast <= 78)) {
      seas = "Winter";
    }
    return seas;
  }
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int month = 0;
  int day = 0;
  System.out.print("Enter a month: ");
  month = scan.nextInt();
  System.out.print("Enter a day: ");
  day = scan.nextInt();
  System.out.println("It is " + season(month, day) + "!");
  }
}
