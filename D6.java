import java.util.*;

public class D6 implements Dice {
  private final Random rand = new Random();

  @Override
  public int roll() {
    return rand.nextInt(6) + 1;
  }
}
