import java.util.*;

public class Main {
  public static void main(String[] args) {
    D6 d6 = new D6();
    D20 d20 = new D20();
    Dice d6tod20 = new D6toD20Adapter((D6) d6);
    Dice d20tod6 = new D20toD6Adapter((D20) d20);
    System.out.println("d6 result: " + d6.roll());
    System.out.println("d20 result: " + d20.roll());
    System.out.println("d6tod20 adapter result: " + d6tod20.roll());
    System.out.println("d20tod6 adapter result: " + d20tod6.roll());
  }
}
