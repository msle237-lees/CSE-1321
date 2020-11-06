import java.util.*;

class Lab10B {
  public static Scanner scan = new Scanner(System.in);
  public static void method(String s) {
    String x = "dang";
    String y = "Dang";
    String i = "&^#@";
    s = s.replace(x, i);
    s = s.replace(y, i);
    System.out.println(s);
  }
  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    method(s);
  }
}
