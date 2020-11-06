import java.util.*;
public class Assignment6C {
  public static void convert(char c, String st, int i) {
    int s = 0;
    switch (c) {
      case 'a' : s = "4";
      break;
      case 'b': s = "B";
      break;
      case 'c': s = "(";
      break;
      case 'd': s = "D";
      break;
      case 'e': s = "3";
      break;
      case 'f': s = "Ph";
      break;
      case 'g': s = "9";
      break;
      case 'h': s = "|-|";
      break;
      case 'i': s= "1";
      break;
      case 'j': s = "j";
      break;
      case 'k': s = "|<";
      break;
      case 'l': s = "L";
      break;
      case 'm': s="/\\\\/\\\\";
      break;
      case 'n': s= "|\\\\|";
      break;
      case 'o': s = "0";
      break;
      case 'p': s = "P";
      break;
      case 'q': s = "Q";
      break;
      case 'r': s = "R";
      break;
      case 's': s = "$";
      break;
      case 't': s = "7";
      break;
      case 'u': s= "U";
      break;
      case 'v': s= "\\V";
      break;
      case 'w': s = "\\V\\V";
      break;
      case 'x': s = "><";
      break;
      case 'y': s= "'/";
      break;
      case 'z': s="Z";
      break;
      case ' ': s=" ";
      break;
    }
    st.erase(i);
    st = st.insert(i, s);
    return s;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    String st = "";
    char[] arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i);
    }
    for (int j = 0; j < s.length(); j++) {
      st = st + convert(arr[j],s,j);
    }
    System.out.println(st);
  }
}
