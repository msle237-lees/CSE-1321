import java.util.*;
public class Assignment6A {
  public static float nmap(float in, float min, float max, float newmin, float newmax) {
    return (((in - min) * (newmax - newmin)) / (max - min) + newmin);
  }

  public static void convert(float red, float blue, float green) {
    System.out.println("New color is red = " + nmap(red, 0, 255, 0, 1) + ", green = " + nmap(green, 0, 255, 0, 1) + ", blue = " + nmap(blue, 0, 255, 0, 1));
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int red = 0;
    int green = 0;
    int blue = 0;
    System.out.print("Enter a red value (0 - 255): ");
    red = scan.nextInt();
    System.out.print("Enter a green value (0 - 255): ");
    green = scan.nextInt();
    System.out.print("Enter a blue value (0 - 255): ");
    blue = scan.nextInt();
    convert(red, blue, green);
  }
}
