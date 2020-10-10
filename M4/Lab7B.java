import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

class Lab7B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of GPAs: ");
    int ArraySize =  scan.nextInt();
    float[] array = new float[ArraySize];
    for (int i = 0; i < ArraySize; i++) {
      System.out.print("GPA #" + i + ": ");
      array[i] = scan.nextFloat();
    }
    for (int j = 0; j < ArraySize; j++) {
      if (array[j] >= 3.9) {
        System.out.println("Student #" + j + ": Summa Cum Laude");
      }
      else if (array[j] <= 3.89 && array[j] >= 3.7) {
        System.out.println("Student #" + j + ": Magna Cum Laude");
      }
      else if (array[j] <= 3.69 && array[j] >= 3.5) {
        System.out.println("Student #" + j + ": Cum Laude");
      }
      else {
        System.out.println("Student #" + j + ": Graduating");
      }
    }
  }
}
