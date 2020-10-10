import java.util.Scanner;
import java.util.Arrays;

class Lab8B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] X = new int[15];
    for (int i = 0; i < 15; i++) {
      System.out.print("Enter slot " + i + ": ");
      X[i] = scan.nextInt();
    }
    System.out.print("Enter a target: ");
    int Y = scan.nextInt();
    String string_of_array = Arrays.toString(X)
            .replace(",", "|")
            .replace("", "")
            .replace(" ", "")
            .replace("[", "")
            .replace("]", "|");
    System.out.println(string_of_array);
    int j = 0;
    while (X[j] <= Y) {
      System.out.print(j + " ");
      j++;
    }
    System.out.println();
    int low = 0;
    int mid = 0;
    int high = X.length - 1;
    boolean found = false;
    while (high >= low) {
      mid = (low + high) / 2;
      if (Y < X[mid]) {
        high = mid - 1;
      }
      else if (Y == X[mid]) {
        found = true;
        System.out.print(mid + " ");
        break;
      }
      else {
        low = mid + 1;
      }
      System.out.print(mid + " ");
    }
  }
}
