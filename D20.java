import java.util.*;
public class D20 implements Dice {
  private final Random rand = new Random();

  @Override
  public int roll() {
    return rand.nextInt(20) + 1;
  }
}
