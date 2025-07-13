public class D20toD6Adapter implements Dice {
  private final D20 d20;

  public D20toD6Adapter(D20 d20) {
    this.d20 = d20;
  }

  @Override
  public int roll() {
    int value = d20.roll();
    return ((value - 1) % 6) + 1;
  }
}
