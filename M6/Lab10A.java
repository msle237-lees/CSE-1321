import java.util.*;

class Lab10A {
  public static Scanner scan = new Scanner(System.in);
  public static int method(char[] arr, String s) {
    int vowel = 0;
    for (int j = 0; j < s.length(); j++) {
      if (arr[j] == 'a' || arr[j] == 'A') {
        vowel++;
        arr[j] = '*';
      }
      else if (arr[j] == 'e' || arr[j] == 'E') {
        vowel++;
        arr[j] = '*';
      }
      else if (arr[j] == 'i' || arr[j] == 'I') {
        vowel++;
        arr[j] = '*';
      }
      else if (arr[j] == 'o' || arr[j] == 'O') {
        vowel++;
        arr[j] = '*';
      }
      else if (arr[j] == 'u' || arr[j] == 'U') {
        vowel++;
        arr[j] = '*';
      }
    }
    String string_of_arr = Arrays.toString(arr)
            .replace(",", "")
            .replace(" ", " ")
            .replace("[", "")
            .replace("]", "");
    System.out.println(string_of_arr);
    return vowel;
  }
  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    char[] arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i);
    }
    int vowel = method(arr, s);
    System.out.println("That string has " + vowel + " vowels.");
  }
}
