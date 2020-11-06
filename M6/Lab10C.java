import java.util.*;

class Lab10C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= 'a' && c <= 'm') {
        c += 13;
      }
      else if (c >= 'n' && c <= 'z') {
        c -= 13;
      }
      System.out.print(c);
    }
  }
}
