import java.util.Scanner;
import java.util.Arrays;

class Lab8A {
  public static void main(String[] args) {
    int[] data = new int[10];
    Scanner scan = new Scanner(System.in);
    int temp = 0;
    int swap = 0;
    int tswap = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter slot " + i + ": ");
      data[i] = scan.nextInt();
    }
    for (int j = 0; j < 10; j++) {
      for (int h = 0; h < 9; h++) {
        if (data[h] > data[h + 1]) {
          temp = data[h];
          data[h] = data[h + 1];
          data[h + 1] = temp;
          swap++;
        }
      }
      String string_of_array = Arrays.toString(data)
              .replace(",", "|")
              .replace("", "")
              .replace("[", "")
              .replace("]", "|");
      System.out.println(string_of_array + " Num swaps: " + swap);
    }
  }
}
