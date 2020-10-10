import java.util.*;

class Assignment4B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Size: ");
    int size = scan.nextInt();
    for (int i = 0; i <= size + (size * 100) + 5; i++) {
      if (i > 0) {
        for (int j = 0; j < i; j++) {
          System.out.print("  ");
        }
      }
      for (int h = 0; h < size; h++) {
        System.out.print(String.valueOf(h) + " ");
      }
      System.out.println();
      size = size - 1;
    }
  }
}
