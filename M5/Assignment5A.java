import java.util.Scanner;
import java.util.Arrays;

class Assignment8A {
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
    // System.out.println("years: " + string_of_years);
    // System.out.println("stats: " + string_of_stat);
    int largest = -1;
    for (int h = 0; h < stat.length; h++) {
      if (stat[h] > largest) {
        largest = stat[h];
      }
    }
    int beststat = -1;
    for (int k = 0; k < stat.length; k++) {
      if (stat[k] == largest) {
        beststat = k;
      }
    }
    System.out.println("Best stat was " + stat[beststat] + " in the year " + years[beststat]);
    int smallest = 1000;
    for (int o = 0; o < stat.length; o++) {
      if (stat[o] < smallest) {
        smallest = stat[o];
        System.out.println(smallest);
      }
    }
    int worststat = -1;
    for (int u = 0; u < stat.length; u++) {
      if (stat[u] == smallest) {
        worststat = stat[u];
        System.out.println(worststat);
      }
    }
    System.out.println("Worst stat was " + stat[worststat] + " in the year " + years[worststat]);
  }
}
