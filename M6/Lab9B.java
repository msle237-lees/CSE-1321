import java.util.Scanner;
import java.util.Arrays;

class Lab9B {
  public static Scanner sc = new Scanner(System.in);
  public static int[] initArray(int size) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }
    return arr;
  }
  public static void enterNum(int[] arr, int slot, int value) {
    arr[slot] = value;
  }
  public static void printArray(int[] arr) {
    String string_of_arr = Arrays.toString(arr)
            .replace(",", "|")
            .replace(" ", "")
            .replace("[", "|")
            .replace("]", "");
    System.out.println(string_of_arr);
  }
  public static void printSum(int[] arr) {
    int sum = 0;
    for (int p = 0; p < arr.length; p++) {
      sum = sum + arr[p];
    }
    System.out.println(sum);
  }
  public static void resArray(int[] arr) {
    for (int l = 0; l < arr.length; l++) {
      arr[l] = 0;
    }
  }
  public static void printMenu() {
    System.out.println("Would you like to: ");
    System.out.println("1) Enter a number");
    System.out.println("2) Print the array");
    System.out.println("3) Find the sum of the array");
    System.out.println("4) Reset the array");
    System.out.println("5) Quit");
  }
  public static void main(String[] args) {
    int choice = 0;
    int[] arr = initArray(10);
    do {
      printMenu();
      choice = sc.nextInt();
      if (choice == 1) {
        System.out.print("Enter the slot: ");
        int slot = sc.nextInt();
        System.out.print("Enter the new value: ");
        int value = sc.nextInt();
        enterNum(arr, slot, value);
      }
      else if (choice == 2) {
        printArray(arr);
      }
      else if (choice == 3) {
        printSum(arr);
      }
      else if (choice == 4) {
        resArray(arr);
      }
  } while (choice != 5);
  }
}
