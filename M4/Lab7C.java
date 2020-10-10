import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

class Lab7C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the arrays: ");
    int ArraySize = scan.nextInt();
    int[] array1 = new int[ArraySize];
    int[] array2 = new int[ArraySize];
    for (int i = 0; i < ArraySize; i++) {
      System.out.print("Enter array 1 slot " + i + ": ");
      array1[i] = scan.nextInt();
      System.out.print("Enter array 2 slot " + i + ": ");
      array2[i] = scan.nextInt();
    }
    if(Arrays.equals(array1, array2) == true) {
      System.out.println("The arrays are identical");
    }
    else {
      System.out.println("The arrays are not identical");
    }
  }
}
