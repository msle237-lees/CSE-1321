import java.util.*;

class Assignment4C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Width: ");
    int width = scan.nextInt();
    for (int i = 0; i < width; i++) { // First Line
      System.out.print("* ");
    }
    System.out.println();
    for (int j = 0; j < width - 2; j++) { // Controls number of lines
      for (int h = 0; h < width; h++) { // Controls length of line
        if (h == 0 || h == width - 1) { // Finds first and last character
          System.out.print('*');
        }
        else {
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int k = 0; k < width; k++) { // Last Line
      System.out.print("* ");
    }
  }
}
// System.out.println();
// for (int j = 0; j <= width - 3; j++) { //middle layers
//   System.out.print("*");
//   for (int h = 0; h < width * 1.75; h++) { //spaces between them
//     System.out.print(" ");
//   }
//   System.out.println("*"); //final character in middle line
// }
// for (int i = 0; i < width; i++) {
//   System.out.print("* " ); //last layer
// }
