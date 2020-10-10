import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Scanner;

class Lab7A {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int ArraySize =  scan.nextInt();
    int[] array = new int[ArraySize];
    for (int i = 0; i < ArraySize; i++) {
      array[i] = i * i;
    }
    String string_of_array = Arrays.toString(array)
            .replace(",", "|")
            .replace("", "")
            .replace("[", "|")
            .replace("]", "");
    System.out.println(string_of_array);
  }
}
