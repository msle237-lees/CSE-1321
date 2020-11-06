import java.util.*;
class LightBulb {
  int Bulb1_Wattage;
  int Bulb2_Wattage;
  int Bulb1_TWatts;
  int Bulb2_TWatts;
  int Bulb1_ID;
  int Bulb2_ID;
  boolean Bulb1_State = false;
  boolean Bulb2_State = false;
  boolean[] Bulb_State = {Bulb1_State, Bulb2_State};
  public int[] Default_Constructor() {
    Bulb1_ID = 0;
    Bulb1_Wattage = 40;
    Bulb1_TWatts = 0;
    int[] Bulb1_Info = {Bulb1_ID, Bulb1_Wattage, Bulb1_TWatts};
    return Bulb1_Info;
  }
  public int[] Secondary_Constructor(int Bulb2_ID, int Bulb2_Wattage) {
    Bulb2_ID = Bulb2_ID;
    Bulb2_Wattage = Bulb2_Wattage;
    Bulb2_TWatts = 0;
    int[] Bulb2_Info = {Bulb2_ID, Bulb2_Wattage, Bulb2_TWatts};
    return Bulb2_Info;
  }
  public boolean[] Modifier(boolean Bulb1_State, boolean Bulb2_State) {
    Bulb_State[0] = Bulb1_State;
    Bulb_State[1] = Bulb2_State;
    return Bulb_State;
  }
  public void Print(int Bulb1_TWatts, int Bulb2_TWatts) {
    if (Bulb_State[0] == true) {
      System.out.println("Bulb 0 is on and has used " + Bulb1_TWatts + " watt-hours.");
    }
    else {
      System.out.println("Bulb 0 is off and has used " + Bulb1_TWatts + " watt-hours.");
    }
    if (Bulb_State[1] == true) {
      System.out.println("Bulb 1 is on and has used " + Bulb2_TWatts + " watt-hours.");
    }
    else {
      System.out.println("Bulb 1 is off and has used " + Bulb2_TWatts + " watt-hours.");
    }
  }
  public int[] Increment_Time(int hours, boolean[] Bulb_State, int Bulb1_Wattage, int Bulb2_Wattage) {
    if (Bulb_State[0] == true) {
      Bulb1_TWatts = hours * Bulb1_Wattage;
    }
    else {
      Bulb1_TWatts = 0;
    }
    if (Bulb_State[1] == true) {
      Bulb2_TWatts = hours * Bulb2_Wattage;
    }
    else {
      Bulb2_TWatts = 0;
    }
    int[] Bulb_TWatts = {Bulb1_TWatts, Bulb2_TWatts};
    return Bulb_TWatts;
  }
}

public class Lab12A {
  public static void main(String[] args) {
    LightBulb A = new LightBulb();
    int[] bulb1 = A.Default_Constructor();
    int[] bulb2 = A.Secondary_Constructor(1, 100);
    A.Print(0, 0);
    boolean[] Bulb_State = A.Modifier(false, true);
    int[] Bulb_TWatts = A.Increment_Time(5, Bulb_State, bulb1[1], bulb2[1]);
    A.Print(Bulb_TWatts[0], Bulb_TWatts[1]);
  }
}
