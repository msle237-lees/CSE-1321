import java.util.Scanner;
import java.util.Arrays;

class Assignment5B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of years: ");
    int nomyears = scan.nextInt();
    System.out.print("Enter the starting year: ");
    int styear = scan.nextInt();
    int[] years = new int[nomyears];
    int[] stat = new int[nomyears];
    years[0] = styear;
    for (int i = 1; i < nomyears; i++) {
      years[i] = years[i-1] + 1;
      // System.out.println(years[i]);
    }
    for (int j = 0; j < nomyears; j++) {
      System.out.print("Enter stat for year " + years[j] + ": ");
      stat[j] = scan.nextInt();
    }
    int[] sorted_stat = new int[nomyears];
    for (int k = 0; k < nomyears; k++) {
      sorted_stat[k] = stat[k];
    }
    Arrays.sort(sorted_stat);
    int[] sorted_years = new int[nomyears];
    for (int n = 0; n < nomyears; n++) {
      for (int m = 0; m < nomyears; m++) {
        if (sorted_stat[n] == stat[m]) {
          sorted_years[n] = years[m];
        }
      }
    }
    String string_of_sorted_years = Arrays.toString(sorted_years)
            .replace(",", "|")
            .replace("", "")
            .replace(" ", "")
            .replace("[", "")
            .replace("]", "|");
    System.out.println(string_of_sorted_years);
  }
}
